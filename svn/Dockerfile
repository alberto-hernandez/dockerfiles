FROM alpine
MAINTAINER Alberto Hernandez "alberto.hernandez@itdev.rocks"


# Install and configure Apache WebDAV and Subversion
RUN apk --no-cache add apache2 apache2-utils apache2-webdav mod_dav_svn subversion && \
	mkdir -p /run/apache2 /home/apache2/bin /var/data/svn

ADD svn-virtualhost.conf /etc/apache2/conf.d/

# Created Directory and Initializate Directory
ADD svn-server.sh /home/apache2/bin
RUN chmod +x /home/apache2/bin/svn-server.sh

# Define default command
CMD ["/home/apache2/bin/svn-server.sh"]
