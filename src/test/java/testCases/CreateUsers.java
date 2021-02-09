package testCases;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateUsers 
{
	public void createUser(int userId, int id, String title, String body)
	{
		JSONObject request = new JSONObject();
		request.put("userId", userId);
		request.put("id", id);
		request.put("title", title);
		request.put("body", body);
		
		//Fire the request
		given().
			header("Content-Type", "application/json", "").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("https://jsonplaceholder.typicode.com/posts").
		then().
			statusCode(201).
			log().all();
		//System.out.println(request.toJSONString());
	}

}
