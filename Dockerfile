#Ensure you have the compiled file in the target directory

FROM openjdk:8-jre-alpine

RUN mkdir MaryPoppins
COPY ./target/MaryPoppins-1.0-SNAPSHOT-shaded.jar MaryPoppins

RUN adduser -D myuser
USER myuser

EXPOSE 7000
ENTRYPOINT ["/usr/bin/java", "-jar", "MaryPoppins/MaryPoppins-1.0-SNAPSHOT-shaded.jar"]