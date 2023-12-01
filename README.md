# Xpeer

### Environment

* Recommended IDE Spring tools: https://spring.io/tools
* The first time you open it, select as workspace the folder where you have cloned the repository
* Go to "File" -> "Import" -> "Maven" -> Existing Maven Projects. Browse and select the folder xpeer-courses
* Run the application in the IDE from tag "Boot Dashboard", expand "local", right button on "xpeer-courses" and start
* By default, the app is running in port 8080
* Go to http://localhost:8080/test/hello for testing

### Requirements

Xpeer needs a backoffice solution to allow different functionalities of courses and modules.
A course can contain several modules.

The course have the following properties:
	course id (key)
    course name (mandatory)
	description
	publish status (DRAFT, PUBLISHED, ARCHIVED) (mandatory)
	publication date  (mandatory)

Every course is composed of a list of modules, with the following properties:
	module id (key)
	module name (mandatory)
	
Your tasks are implement the following functionalities:
	- The endpoints to provide a CRUD of courses (create, read, update and delete)
	- An endpoint to obtain the list of courses. It must be possible paginate the results.
	- An endpoint to obtain the modules of a course	
	
### Code

* Database is automatically created based in the entities
* Database is initially populated in class CoursesLoadDatabase
