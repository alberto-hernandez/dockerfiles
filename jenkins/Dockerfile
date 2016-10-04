FROM jenkins
MAINTAINER Alberto Hernandez "alberto.hernandez@itdev.rocks"

ENV http_proxy $http_proxy
ENV https_proxy $https_proxy

COPY plugins.txt /usr/share/jenkins/plugins.txt
COPY executors.groovy /usr/share/jenkins/ref/init.groovy.d/executors.groovy
COPY maven-installation.groovy /usr/share/jenkins/ref/init.groovy.d/maven-installation.groovy
COPY java-installation.groovy /usr/share/jenkins/ref/init.groovy.d/java-installation.groovy
COPY proxy.groovy /usr/share/jenkins/ref/init.groovy.d/00proxy.groovy

RUN /usr/local/bin/plugins.sh /usr/share/jenkins/plugins.txt
