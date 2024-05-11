FROM openjdk:21-jdk-alpine
RUN  apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/licenses
ADD  @project.build.finalName@.jar /usr/local/licenses/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh