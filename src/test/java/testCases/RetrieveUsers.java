package testCases;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RetrieveUsers 
{
	public void RetrieveAllUsers(String lastID, int lastIDValue)
	{
		given().
			get("https://jsonplaceholder.typicode.com/posts").
		then().
			statusCode(200).
			body(lastID, equalTo(100)).
			//body("id", hasItems(lastIDValue)).
			log().all();
	}
	
	public void RetrieveSpecificUser(int userID, int id)
	{
		given().
			get("https://jsonplaceholder.typicode.com/posts/"+Integer.toString(id)).
		then().
			statusCode(200).
			body("userId", equalTo(4)).
			body("id", equalTo(35)).
			//body("title", hasItems(99, 100)).
			log().all();
	}

}
