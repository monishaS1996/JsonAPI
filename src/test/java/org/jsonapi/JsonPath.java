package org.jsonapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class JsonPath {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		Response response = RestAssured.given().queryParam("page", "2").when().get("/api/users");
		response.asPrettyString();
		String string = response.jsonPath().getString("data[1].id");
		System.out.println(string);
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
	}

}
