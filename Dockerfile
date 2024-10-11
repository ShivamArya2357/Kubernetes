FROM --platform=linux/amd64 openjdk:17
ADD target/springboot-eks.jar springboot-eks.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "springboot-eks.jar"]