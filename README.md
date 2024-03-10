````bash
mvn clean 
mvn package
mvn install -pl common -am
java -agentlib:native-image-agent=config-output-dir=C:\Users\17335\Desktop\graalvm-demo\api\src\main\resources\META-INF\native-image -jar .\api\target\api-0.0.1-SNAPSHOT.jar
mvn -Pnative native:compile
`````