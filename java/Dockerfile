# Pull base image
FROM openjdk:alpine

# Install Gradle manually
ARG GRADLE_VERSION=4.9

RUN mkdir /opt

## wget to retrieve the distribution zip folder
## Unzip and extract to /opt folder 
## Delete the distribution zip folder
RUN wget https://services.gradle.org/distributions/gradle-${GRADLE_VERSION}-bin.zip \
    && unzip gradle-${GRADLE_VERSION}-bin.zip -d /opt \
    && rm gradle-${GRADLE_VERSION}-bin.zip

ENV PATH $PATH:/opt/gradle-${GRADLE_VERSION}/bin

COPY . /app
WORKDIR /app