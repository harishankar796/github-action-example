FROM openjdk:11
EXPOSE 8080
ADD target/springboot-github_action-cicd-example.jar springboot-github_action-cicd-example.jar
ENTRYPOINT ["java","jar","/springboot-github_action-cicd-example.jar"]