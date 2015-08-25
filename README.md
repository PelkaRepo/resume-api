# resume-api
API connectivity layer for the resume building web UI.  Grabs data from source systems REST services for UI consumption.

#### Architecture
This website uses Java Springboot and builds using Apache Maven.  The API also requires a live and active connection to LinkedIn.

#### Setup
Project uses Maven style builds structure and Java EE 1.7 or higher.  Also, the web application artifact deploys as a WAR on an application server such as Tomcat 7 or higher.

#### Compile & Deploy
Run the following Maven build command to generate a deployable WAR:

  
	mvn clean compile package
  

Deploy this war to Tomcat with the following context path:

  
  /cv-api
  

#### API
This API uses standard REST format.  Also, a POST via REST is required to get data from source systems, but is run automatically on a set schedule.  The following is a full explanation of all API endpoints:

  
  [Coming soon.]
  
