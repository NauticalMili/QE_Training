#Set  Base Image
FROM docker.io/node:alpine

#Set Work Directory
WORKDIR /user/app

#Copy Files
COPY . .

#Install Dependencies
RUN npm i

#Run
CMD ["npm", "start"]