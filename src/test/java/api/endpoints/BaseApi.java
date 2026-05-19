package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BaseApi {
	
	public static Response post(String url, Object body, String token) {
		
		return given()
				.header("Authorization", token != null ? "Bearer " + token : "")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(body)
			.when()
			.post(url);
		
	}

}
