FROM itdev-rocks/java8
MAINTAINER Alberto Hernandez "alberto.hernandez@itdev.rocks"

# Download and install jetty
ENV JETTY_VERSION 9.4.6
ENV RELEASE_DATE v20170531
ENV URL_BASE http://repo1.maven.org/maven2/org/eclipse/jetty/jetty-distribution


RUN . /etc/profile.d/proxy.sh && \
	wget ${URL_BASE}/${JETTY_VERSION}.${RELEASE_DATE}/jetty-distribution-${JETTY_VERSION}.${RELEASE_DATE}.tar.gz && \
    tar -xzvf jetty-distribution-${JETTY_VERSION}.${RELEASE_DATE}.tar.gz && \
    rm -rf jetty-distribution-${JETTY_VERSION}.${RELEASE_DATE}.tar.gz && \
    mv jetty-distribution-${JETTY_VERSION}.${RELEASE_DATE}/ /opt/jetty

# Configure Jetty user and clean up install
RUN useradd jetty && \
    chown -R jetty:jetty /opt/jetty && \
    rm -rf /opt/jetty/webapps.demo

# Executing with jetty user
USER jetty

# Set defaults for docker run
WORKDIR /opt/jetty
CMD ["java", "-jar", "start.jar", "jetty.home=/opt/jetty"]
