cd love-service-impl
### nohup java -jar love-service.jar --server.port=18903 &
nohup java -jar -Xms128m -Xmx256m -XX:SurvivorRatio=6 -XX:MaxMetaspaceSize=64m -XX:MetaspaceSize=64m -XX:+UseConcMarkSweepGC -XX:+CMSClassUnloadingEnabled -XX:ConcGCThreads=1 -Dapp.name=love-service -Dapp.group=test -Dserver.tomcat.accesslog.directory=/home/admin/love-service/logs -XX:CMSInitiatingOccupancyFraction=70 love-service.jar --server.port=18903 &
