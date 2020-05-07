# Mary Poppins

A simple crud app to test out Javalin with Pebble templating.  Additionally this project can be deployed via the Dockerfile to Heroku. 

With added super kicks!

## How to deploy a Kotlin app to Heroku via Docker

#### Dependencies:

* Maven command line tools 3.6.3+
* Docker and command line tools 19.0.3+
* Heroku CLI 7.40.0+
* All other dependencies included in the pom.xml file - including the required [Maven Shade Plugin](http://maven.apache.org/plugins/maven-shade-plugin/)

### 1. Compile the project

Once you have opened up the project, execute ```mvn package``` in the terminal ensuring you are in the root of your project.

This should create a .jar file of the format ```{projectName-versionDeclaredInPOM}-shaded.jar``` in this case it is ```MaryPoppins/MaryPoppins-1.0-SNAPSHOT-shaded.jar```

### 2. Build the docker container

Again ensuring you are in the root of your project, build the docker image using the included Dockerfile:

```docker build [-t {name} *optional*] .```

You can test the app boots up in the docker container locally by running

```docker run -p 7000:7000 {name or docker image id}```

### 3. Deploy to Heroku

Once you are happy that it works locally, login to Heroku via the CLI:

```heroku login```

Additionally we want to navigate to the Heroku Container Registry:

```heroku container:login```

Create an app in Heroku where you docker image will be pushed to:

```heroku create {app name}```

You can then push the docker image as follows:

```heroku container:push web --app={app name created in heroku}```

Once that it successful, you can then release the aoo like so:

```heroku container:release web --app={app name created in heroku}```


