FROM openjdk:8-jdk-alpine

RUN apk add --no-cache curl

WORKDIR /usr/local/bin

COPY ./build/libs/helloworld*.jar /app.jar

CMD java \
    -Dserver.port=8080 \
    -jar \
    /app.jar

EXPOSE 8080

HEALTHCHECK --start-period-15s --interval=15s CMD["curl", "localhost:8080/health"]