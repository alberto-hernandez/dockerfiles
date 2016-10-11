FROM java8/jetty9

ENV HAWTIO_VERSION 1.4.65
ENV HAWTIO_WAR hawtio-default-${HAWTIO_VERSION}.war
ENV HAWTIO_URL https://oss.sonatype.org/content/repositories/public/io/hawt/hawtio-default/${HAWTIO_VERSION}/${HAWTIO_WAR}

RUN wget ${HAWTIO_URL} -qO /opt/jetty/webapps/hawtio.war

COPY login.* /opt/jetty/etc/
COPY jettyrc /home/jetty/.jettyrc
RUN chown -R jetty:jetty /home/jetty

RUN echo "--module=jaas" >> /opt/jetty/start.ini

USER jetty

CMD ["bin/jetty.sh", "run"]
