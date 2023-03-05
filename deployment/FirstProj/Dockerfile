FROM openjdk:18-jdk-alpine3.14

RUN apk --no-cache add curl


MAINTAINER Dhiman Mandal

EXPOSE 9000

COPY demo-0.0.1-SNAPSHOT.jar .

CMD java -jar demo-0.0.1-SNAPSHOT.jar


