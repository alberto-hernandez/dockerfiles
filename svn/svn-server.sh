#!/bin/sh

svn_dir="/var/data/svn/default" ;
if [ -n "$REPO" ]; then
	svn_dir="/var/data/svn/$REPO" ;
fi

echo "INFO: Trying to Create repository in [$svn_dir]"
test ! -d "$svn_dir" && svnadmin create $svn_dir && chgrp -R apache $svn_dir && chmod -R 775 $svn_dir


svnuser=testuser
svnpass=testme
if [ -n "$SVN_USER" ] && [ -n "$SVN_PASS" ]; then
	svnuser=$SVN_USER
	svnpass=$SVN_PASS
fi

echo "INFO: Starting the users directory with [$svnuser]"

htpasswd -bc /etc/apache2/conf.d/svn.htpasswd $svnuser $svnpass

httpd -D FOREGROUND
