FROM openjdk:8-jdk-alpine
COPY build/libs/micronaut-*-all.jar micronaut-test-1.0-SNAPSHOT.jar
EXPOSE 8888
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "micronaut-test-1.0-SNAPSHOT.jar"]