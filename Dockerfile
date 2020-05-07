# Ensure you have the compiled file in the target directory

FROM openjdk:8-jre-alpine

RUN mkdir MaryPoppins
COPY ./target/MaryPoppins-1.0-SNAPSHOT-shaded.jar MaryPoppins

# Heroku does not run as root user, need user to ensure the container works without root user
RUN adduser -D myuser
USER myuser

EXPOSE 7000
ENTRYPOINT ["/usr/bin/java", "-jar", "MaryPoppins/MaryPoppins-1.0-SNAPSHOT-shaded.jar"]