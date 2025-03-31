# vert-x-musl

Be sure to got docker and maven installed .

Then :

mvn clean install -P docker

Then :

docker run --tmpfs /app/tmp:rw,size=64m -p 8080:8080 docker.io/library/services:0.0.1-SNAPSHOT
