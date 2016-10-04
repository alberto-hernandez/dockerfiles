# How to use the docker

You should run the docker container using 
```
docker run -p 8080:8080 -e http_proxy=$proxy_proxy -v /home/ahernandez/jenkins/:/var/jenkins_home -t itdev-rocks/jenkins
``
