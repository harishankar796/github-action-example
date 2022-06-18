FROM openjdk:11
EXPOSE 8888
ADD target/springboot-github_action-cicd-example.jar springboot-github_action-cicd-example.jar
ENTRYPOINT ["java","jar","/springboot-github_action-cicd-example.jar"]