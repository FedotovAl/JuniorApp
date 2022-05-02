##How to deploy the application to docker. Guide:
1. Copy the repository to your machine
2. Build project. Make sure directory <span style="color:red">build/libs/</span> contains <span style="color:red">.jar</span> file
3. Use below command from root directory <span style="color:red">/myapp</span> to create docker image
   ```
   docker build .
   ```
4. find image id of created docker image in step 3
   ```
   docker images
   ```
5. use below command to run container
      ```
   docker run -p 8088:8088 *[Image id]
   ```
   where *[image id] is the value found in step 3
6. open your browser and go to http://localhost:8088/greetings