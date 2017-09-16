# kot
Sample project using Spring Boot with Kotlin and Gradle. 

### run app
gradlew bootRun

### deploy to bluemix
cf push kot -m 128M -p build/libs/kot-0.0.1-SNAPSHOT.jar
