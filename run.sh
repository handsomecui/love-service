cd love-service-impl
### nohup java -jar love-service.jar --server.port=18903 &
nohup java -jar -Dapp.name=love-service -XX:MetaspaceSize=32m -XX:MaxMetaspaceSize=64m -Xms128m -Xmx128m -Xmn32m -Xss256k -XX:SurvivorRatio=8 -XX:+UseConcMarkSweepGC -Dserver.tomcat.accesslog.directory=/home/admin/love-service/logs love-service.jar --server.port=18903 &
