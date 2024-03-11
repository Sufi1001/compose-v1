ARG BUILD_HOME=/backend/a
FROM gradle:jdk17 as build-image
ARG BUILD_HOME
ENV APP_HOME=$BUILD_HOME
WORKDIR $APP_HOME
COPY --chown=gradle:gradle build.gradle settings.gradle gradle.properties $APP_HOME/
COPY --chown=gradle:gradle src $APP_HOME/src
COPY --chown=gradle:gradle . $APP_HOME/config
RUN gradle clean build

FROM openjdk:17-jdk-slim
ARG BUILD_HOME
ENV APP_HOME=$BUILD_HOME
COPY --from=build-image $APP_HOME/build/libs/a-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8090

ENTRYPOINT ["java","-jar","app.jar", "-Dspring.profiles.active=local,hello-world,sender"]