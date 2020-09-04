# Simple Example of using docker
The project uses docker  image file `Dockerfile` to wrap  a web application into  docker  image

## Usage
  
##### 1. Bulding the  image
    
        docker image build -t webapp .
        
##### 2. Running the container

        docker container run -d  --name  webweb -p 8080:8080 webapp          

#### 3. Accessing the resource

        curl http://localhost:8080/webapp/api/v1