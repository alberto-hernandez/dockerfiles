# IT Dev Rocks Base Image
#
# https://github.com/dockerfile/java
# https://github.com/dockerfile/java/tree/master/oracle-java8
#

# Pull base image.
FROM ubuntu
MAINTAINER Alberto Hernandez "alberto.hernandez@itdev.rocks

ENV http_proxy $http_proxy
ENV https_proxy $https_proxy

# Install Java.
RUN \
  apt-get update && \
  apt-get install -y python-software-properties software-properties-common && \
  apt-get update
  

