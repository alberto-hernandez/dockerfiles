# How to use the docker

## Description:

Docker image for Jenkins

## Build

```
git clone git@github.com:alberto-hernandez/dockerfiles.git
cd jenkins
docker build -t residenttechy/jenkins .
```

## Run

You should run the docker container using 

```
docker run -d -p 11103:8080 -v /var/data/jenkins:/var/jenkins_home -e ADMIN_USER=ahernandez -e ADMIN_PASS=temporal residenttechy/jenkins
```


