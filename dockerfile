# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine

# copy WAR and files into image
COPY docker/dms-server-0.0.1-SNAPSHOT.war /app.war
#COPY docker/run.sh /run.sh
#COPY src/main/resources/logback.xml /logback.xml

EXPOSE 6060

# run application with this command line
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "/app.war"]

#ENTRYPOINT ["/run.sh"]