# kot
Sample project using Spring Boot with Kotlin and Gradle. 

### run app
gradlew bootRun

### deploy to bluemix
cf push kot -m 256M -p build/libs/kot-0.0.1-SNAPSHOT.jar -f manifest.yml

### url
https://kot.eu-gb.mybluemix.net
