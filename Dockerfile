From openjdk:12
copy ./target/api-rest-0.0.1-SNAPSHOT.jar api-rest-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","api-rest-0.0.1-SNAPSHOT.jar"]