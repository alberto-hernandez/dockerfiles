# ITDev-Rocks SVN
## Description:

Docker image for Subversion.

## Build

```
git clone git@github.com:alberto-hernandez/dockerfiles.git
cd svn
docker build -t itdev-rocks/svn .
```

## Run

With full parameters [[if started with default parameters testuser (password: testme) and the default repository: test]]
```
docker run -d -e SVN_USER=testuser1 -e SVN_PASS=testme1 -e REPO=test1 -p 11130:80 -v /var/data/svn:/var/data/svn -P itdev-rocks/svn
```


## Use


```
svn co --username testuser1 --password testme1 http://localhost:9999/svn/test
# add/chg/commit as usual
```

