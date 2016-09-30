FROM itdev-rocks/java8
MAINTAINER Alberto Hernandez "alberto.hernandez@itdev.rocks"

# Download and install jetty
ENV JETTY_VERSION 9.3.12
ENV RELEASE_DATE v20160915
ENV URL_BASE http://repo1.maven.org/maven2/org/eclipse/jetty/jetty-distribution

RUN wget ${URL_BASE}/${JETTY_VERSION}.${RELEASE_DATE}/jetty-distribution-${JETTY_VERSION}.${RELEASE_DATE}.tar.gz && \
    tar -xzvf jetty-distribution-${JETTY_VERSION}.${RELEASE_DATE}.tar.gz && \
    rm -rf jetty-distribution-${JETTY_VERSION}.${RELEASE_DATE}.tar.gz && \
    mv jetty-distribution-${JETTY_VERSION}.${RELEASE_DATE}/ /opt/jetty

# Configure Jetty user and clean up install
RUN useradd jetty && \
    chown -R jetty:jetty /opt/jetty && \
    rm -rf /opt/jetty/webapps.demo

# Set defaults for docker run
WORKDIR /opt/jetty
CMD ["java", "-jar", "start.jar", "jetty.home=/opt/jetty"]
