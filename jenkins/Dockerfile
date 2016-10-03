FROM jenkins
MAINTAINER Alberto Hernandez "alberto.hernandez@itdev.rocks"

ENV http_proxy $http_proxy
ENV https_proxy $https_proxy

COPY plugins.txt /usr/share/jenkins/plugins.txt
COPY executors.groovy /usr/share/jenkins/ref/init.groovy.d/executors.groovy

RUN /usr/local/bin/plugins.sh /usr/share/jenkins/plugins.txt
