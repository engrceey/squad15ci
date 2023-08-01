package com.projectreadiness.projectreadiness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectreadinessApplication {


	// How to contribute
		// Goal --> Production (Git, Azure, GitBucket)
		// Environment (Prod (permission, signature, test) ,
		// Uat (user acceptance test) ,

		// Dev (Developers bring their contribution here),
		// "Feature" (Your local work is tagged as a feature)
		// , local)

		// Create the repo - Prod, Uat,
		// Dev (check CI) -- policies: Code must come through a PR, Service MUST Build, Run Test cases
		// Merge PR

		// GitHub (Prod, Uat, Dev)
		// Goto Github --> Pull current code Dev--> Checkout Feature
//			Git clone gitmhdsbvsbvksjbvksjb
	// checkout to Dev --> Git checkout -b "dev" --> Pull again: git pull origin dev
	// git checkout -b "feat/setup-security"
	// Do your work
	// commit = git add ., and git commit -m "done with my feature"
	// Pull dev branch again : git pull origin dev
		// Merge conflict / code not running again
	// git push branch ==> "feat/setup-security"
	// make a pull request against dev branch
	// CI --> run test cases, check if service builds
	// Merge to dev



	// Documentation
	// Postman and Swagger
	// Swagger: Dependencies and configure



	// Docker
	// Fontran --> VM (Core Machine (kernel)) + Application side
	// Docker --> Application Side


	// Download Docker --> Linux
	// Images == Classes (docker pull jdk)
	// Instance of an Image == container (docker run "nameofimage" = docker run jdk17:latest)
	// docker ps/ to see all


	// You have docker & app (tomcat) **

	// view == docker ps/ docker ps -a
	// Stop and Start container
	// docker start/stop containerId or containerName

	// docker run -d --name javasquad -p 9000:8080 tomcat


	// Dockerfile == Bunch of linux command that will create an image of our app
	// Inside a docker file we start with the base
	// Docker file
	// FROM jdk:1.88
	// WORKDIR ./app/
	// COPY decktop/mywork/app/
	// RUN app.jar
	// CMD ["executables", "parameters"]


	// docker build Dockerfile
	// run the image




	// Network, //Docker compose (Run images in services)
	// Documentation
	// CI/CD
	// Consuming APIs **



	//Documentation:
	// Swagger: Steps (1)
	// Get the Dependencies:

//	<!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger2 -->
//		<dependency>
//			<groupId>io.springfox</groupId>
//			<artifactId>springfox-swagger2</artifactId>
//			<version>3.0.0</version>
//		</dependency>
//
//		<!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui -->
//		<dependency>
//			<groupId>io.springfox</groupId>
//			<artifactId>springfox-swagger-ui</artifactId>
//			<version>3.0.0</version>
//		</dependency>
//
//		<!-- https://mvnrepository.com/artifact/io.springfox/springfox-bean-validators -->
//		<dependency>
//			<groupId>io.springfox</groupId>
//			<artifactId>springfox-bean-validators</artifactId>
//			<version>3.0.0</version>


	// Swagger: Steps (2)
	// Configure Swagger ** Please check the documentation Package


	// Info << Trace << Warn << Debug
	public static void main(String[] args) {
		SpringApplication.run(ProjectreadinessApplication.class, args);
	}

}
