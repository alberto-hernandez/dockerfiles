#!/bin/bash

set -euo pipefail

docker build -t itdev-rocks/ubuntu ubuntu
docker build -t itdev-rocks/java8 java8
docker build -t itdev-rocks/jetty9 jetty

docker build -t itdev-rocks/svn svn
docker build -t itdev-rocks/jenkins jenkins
docker build -t itdev-rocks/archiva archiva
docker build -t itdev-rocks/sonar sonar
