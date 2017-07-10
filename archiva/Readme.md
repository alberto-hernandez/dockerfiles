# How to use the docker

## Description:

Docker image for Apache Archiva 2.2.3 

## Build

```
git clone git@github.com:alberto-hernandez/dockerfiles.git
cd archiva
docker build -t itdev-rocks/archiva .
```


You should run the docker container using 
```
docker run -d -p 11111:8080 -v /var/data/archiva:/var/data/archiva itdev-rocks/archiva
```
