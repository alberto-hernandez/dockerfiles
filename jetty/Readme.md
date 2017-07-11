# How to use the docker

## Description:

Docker image for Jetty 9

## Build

```
git clone git@github.com:alberto-hernandez/dockerfiles.git
cd jetty
docker build -t itdev-rocks/jetty9 .
```


You should run the docker container using 
```
docker run -t -i -p 11105:8080 itdev-rocks/jetty9
```
