# IT Dev Rocks Base Image
#
# https://github.com/dockerfile/java
# https://github.com/dockerfile/java/tree/master/oracle-java8
#

# Pull base image.
FROM ubuntu
MAINTAINER Alberto Hernandez "alberto.hernandez@itdev.rocks"

ADD 80proxy /etc/apt/apt.conf.d/
ADD proxy.sh /etc/profile.d/

# Install Java.
RUN \
	. /etc/profile.d/proxy.sh && \
	echo "deb http://ppa.launchpad.net/webupd8team/java/ubuntu xenial main" | tee /etc/apt/sources.list.d/webupd8team-java.list && \
	echo "deb-src http://ppa.launchpad.net/webupd8team/java/ubuntu xenial main" | tee -a /etc/apt/sources.list.d/webupd8team-java.list && \
	apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv-keys EEA14886 && \
	apt-get update && apt-get upgrade -y &&  apt-get clean
