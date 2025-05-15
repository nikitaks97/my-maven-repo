FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/my-maven-repo-1.0-SNAPSHOT.jar app.jar
# Expose the port the app runs on
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]