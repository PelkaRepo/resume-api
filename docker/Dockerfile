#
# OpenJDK Java 7 JDK Dockerfile
#
# https://github.com/dockerfile/java
# https://github.com/dockerfile/java/tree/master/openjdk-7-jdk
#

# Pull base image.
FROM ubuntu

# Install Java.
RUN \
  apt-get -qq update -y && \
  apt-get -qq install -y openjdk-7-jdk && \
  apt-get -qq install -y git && \
  apt-get -qq install -y maven && \
  git clone https://github.com/PelkaRepo/resume-api.git && \
  cd ./resume-api && \
  rm -rf /var/lib/apt/lists/*

# Define working directory.
WORKDIR /data

# Define commonly used JAVA_HOME variable
ENV JAVA_HOME /usr/lib/jvm/java-7-openjdk-amd64

# Define default command.
CMD ["mvn spring-boot:run"]
