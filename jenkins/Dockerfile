FROM jenkinsci/blueocean
MAINTAINER Alberto Hernandez "alberto.hdez.acosta@gmail.com"

ENV http_proxy $proxy_http
ENV https_proxy $proxy_https

COPY plugins.txt /tmp/plugins.txt

COPY init/* /usr/share/jenkins/ref/init.groovy.d/
COPY projects/* /usr/share/jenkins/ref/init.groovy.d/

RUN /usr/local/bin/install-plugins.sh < /tmp/plugins.txt
