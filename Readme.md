# Anwendung nur Docker Compose


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

//Nodered
localhost:1880

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


# Install docker kubectl
sudo apt update && sudo apt upgrade <br>

// don't use: sudo snap install docker --classic <br>
// Install Docker Engine for Ubuntu
https://docs.docker.com/engine/install/ubuntu/ <br>
sudo groupadd docker <br>
sudo usermod -aG docker $USER <br>
newgrp docker <br>
docker search hello-world<br>
systemctl stop snap.docker.dockerd.service <br>
systemctl status snap.docker.dockerd.service <br>
systemctl start snap.docker.dockerd.service <br>

sudo snap install kubectl --classic <br>

# Install microk8s
sudo snap install microk8s --classic <br>
sudo usermod -a -G microk8s $USER <br>
sudo chown -R $USER ~/.kube # Probleme <br>
newgrp microk8s <br>
microk8s status <br>
microk8s enable dns <br>
microk8s status <br>
microk8s kubectl <br>
microk8s kubectl cluster-info <br>
echo "alias kubectl='microk8s kubectl'" >> ~/.bashrc <br>
source ~/.bashrc <br>
kubectl <br>
cd $HOME or cd ~ <br>
mkdir .kube <br>
cd .kube <br>
microk8s config > config <br>


# Install kind
[ $(uname -m) = x86_64 ] && curl -Lo ./kind https://kind.sigs.k8s.io/dl/v0.22.0/kind-linux-amd64 <br>
chmod +x ./kind <br>
sudo mv ./kind /snap/bin/kind <br>
unset KUBECONFIG <br>
kind export kubeconfig <br>
kubectl config current-context <br> 

kubectl config get-contexts <br>
kubectl config get-users <br>
kubectl config get-clusters <br>



kubectl create deploy psql --image=image-postgresql --dry-run -o yaml > app-psql.yaml <br>

# Install k9s
sudo snap install k9s <br>
sudo ln -s /snap/k9s/current/bin/k9s /snap/bin/ <br>

# Install Skaffold
curl -Lo skaffold https://storage.googleapis.com/skaffold/releases/latest/skaffold-linux-amd64 && \
sudo install skaffold /usr/local/bin/ <br>

# vbox
// localhost accessing in vbox
https://superuser.com/questions/1119701/how-to-access-server-running-in-virtualbox-from-the-host <br>