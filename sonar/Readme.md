# How to use the docker

## Description:

Docker image for ITDev Rocks Ubuntu Base Image

## Build

```
git clone git@github.com:alberto-hernandez/dockerfiles.git
cd sonar
docker build -t itdev-rocks/sonar .
```


You should run the docker container using 
```
docker run -d -p 11104:9000 itdev-rocks/sonar
```
