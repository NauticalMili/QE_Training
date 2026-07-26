#Set the Base Image
FROM docker.io/alpine

#Set the Working Directory
WORKDIR /user/app

#Install Redis
RUN apk add --update redis

#start Redis Server\
CMD ["redis-server"]