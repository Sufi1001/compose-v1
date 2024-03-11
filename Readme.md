# Anwendung nur Docker Compose

## Installiere in Ubuntu
sudo snap docker --classic <br>


## Dummy Starten:
docker compose up -d --build <br>
docker compose down -v <br>

## Browser URI benutzen:

//Mail <br>
http://localhost:1080/#/ <br>

//Camunda <br>
http://localhost:8080/camunda-welcome/index.html <br>
user: demo <br>
pswd: demo <br>

//RabbitMQ <br>
http://localhost:15672/#/ <br>
user: guest <br>
pswd: guest <br>

// Applikation Backend A <br>
curl http://localhost:8090/ <br>
curl http://localhost:8090/test <br>
curl http://localhost:8090/hello <br>

// Applikation Backend B <br>
curl http://localhost:8091 <br>
curl http://localhost:8091/test <br>
curl http://localhost:8091/hello <br>
curl http://localhost:8091/sendtoangular <br>

//Jenkins <br> 
localhost:49000 <br>
docker exec container_jenkins  cat  /var/jenkins_home/secrets/initialAdminP <br>

//Sonatype Nexus: <br>
localhost:8081 <br>
docker exec -it container_nexus cat /nexus-data/admin.password <br>

//DBeaver <br>
DB-Name: localdb <br>
DB-User: postgres <br>
DB-Pswd: postgres <br>

## Spickzettel Docker  <br>
docker ps <br>
docker ps -a <br>
docker container ls <br>
docker logs < container-name > <br>
docker inspect < container-name >  <br>
docker compose up -d --no-cache <br>
docker compose down <br>

### Docker löschen <br>
docker stop $(docker ps -a -q) <br>
docker rm $(docker ps -a -q) <br>
docker system prune -a <br>
docker image prune <br>
docker rmi $(docker images -a -q) <br>
docker volume prune <br>

### testing dockerignore <br>
rsync -avn . /dev/shm --exclude-from .dockerignore <br>


### Backend Common A
./gradlew wrapper --gradle-version=8.6 <br>
gradle bootrun --args='--spring.profiles.active=local' <br>