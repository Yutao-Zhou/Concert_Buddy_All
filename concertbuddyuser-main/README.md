# concertbuddyuser

User microservice for the ConcertBuddy project

## Docker build:

docker build -t concertbuddyuser-0.0.1 .

docker tag concertbuddyuser-0.0.1 zfmyac/concertbuddyuser-x64

docker push zfmyac/concertbuddyuser-x64

## Docker deploy command:

sudo docker pull zfmyac/concertbuddyuser-x64:latest

sudo docker run -d -p 8012:8080 zfmyac/concertbuddyuser-x64:latest

## Docker shut town:

sudo docker container ls

docker kill [id]
