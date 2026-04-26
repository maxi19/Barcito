FROM tomcat:9.0-jdk11-openjdk
# Remove default apps and copy your WAR file to the webapps folder
RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/BarCap-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]