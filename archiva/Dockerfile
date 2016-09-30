FROM itdev-rocks/java8
MAINTAINER Alberto Hernandez "alberto-hernandez@itdev.rocks"

ENV VERSION 2.2.1

RUN wget http://www.apache.org/dist/archiva/${VERSION}/binaries/apache-archiva-${VERSION}-bin.tar.gz && \
	wget http://www.apache.org/dist/archiva/${VERSION}/binaries/apache-archiva-${VERSION}-bin.tar.gz.md5 && \
	wget http://www.apache.org/dist/archiva/${VERSION}/binaries/apache-archiva-${VERSION}-bin.tar.gz.sha1 && \
    cat  apache-archiva-${VERSION}-bin.tar.gz.md5 | md5sum -c && \
    cat  apache-archiva-${VERSION}-bin.tar.gz.sha1 | sha1sum -c && \
    tar -zxf apache-archiva-${VERSION}-bin.tar.gz -C / && \
    rm apache-archiva-${VERSION}-bin.tar.gz

ENV ARCHIVA_BASE /apache-archiva-$VERSION
WORKDIR /apache-archiva-${VERSION}

RUN mkdir /archiva-data
RUN ln -s /archiva-data /apache-archiva-$VERSION/data
VOLUME /archiva-data

EXPOSE 8080
CMD ["bin/archiva", "console"]