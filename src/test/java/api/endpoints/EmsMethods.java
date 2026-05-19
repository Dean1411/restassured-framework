package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import api.payload.Customer;
import api.payload.User;
import api.utilities.TokenManager;

public class EmsMethods {
	
	public static Map<String, String> body = new HashMap<>();
	public static String accessToken = TokenManager.getToken();
	public static String transactionId;
	public static String message;
	
	
	
	public static Response getAuthToken(User payload) {
		
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				.when()
				.post(Routes.auth_url);
		
		return response;				
	}
	
	public static Response emsVend(Customer payload) {
		
		Response response = given()
				.header("Authorization","Bearer " + accessToken)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				.when()
				.post(Routes.ems_vend);
		
		transactionId = response.jsonPath().getString("transactionId");
		body.put("transactionId", transactionId);
		
		return response;
		
	}
	
	public static Response confirmTransaction() {		   	    
		
		Response response = given()
				.header("Authorization","Bearer " + accessToken)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(body)
				.when()
				.post(Routes.confirm_transaction);
		
		return response;
	}
	
	public static Response cancelTransaction() {
		
		Response response = given()
				.header("Authorization","Bearer " + accessToken)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(body)
				.when()
				.post(Routes.cancel_transaction);
		
		return response;
	}

}
