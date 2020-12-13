Description of the Project:		
	The Project is a Maven Based Spring Boot application Based on Java 8 and uses H2 DataBase ,Spring Data JPA
	
Steps to Run the application:			
	Import the application as existing Maven application
	After Importing the project run the application as spring boot application / run java application "Application.java"
	
Below are end points urls and methods , please use POSTMAN app or SOAP UI to test api's
---------------------------------------------------------------------------------------------------------
Add Employee (id, firstName, lastName)	
Method:POST
	http://localhost:8080/api/v1/employees
Request:
	{
	"id": 1,
	"firstName": "Test1",
	"lastName": "lastName1"
	}
----------------------------------------------------------------------------------------------------------
2. Edit Employee (firstName, lastName)

Method:PUT
	http://localhost:8080/api/v1/employees/1
Request
	{
		"id": 1,
		"firstName": "Test1",
		"lastName": "lastName1"   
	}
-----------------------------------------------------------------------------------------------------------
3. Delete Employee (id)
Method:Delete
	http://localhost:8080/api/v1/employees/1
Request
	{
		"id": 1,
		"firstName": "Test1",
		"lastName": "lastName1"
	   
	}

response:
{
    "deleted": true
}
--------------------------------------------------------------------------------------------------------------
List of All Employees
Method:GET
	http://localhost:8080/api/v1/employees

resp:
	[{"id":1,"firstName":"Test1","lastName":"lastName1","emailId":"emailId1"},{"id":2,"firstName":"Test1","lastName":"lastName1","emailId":"emailId1"}]

---------------------------------------------------------------------------------------------------------------
