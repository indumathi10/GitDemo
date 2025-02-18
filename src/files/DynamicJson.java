package files;

//import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


import io.restassured.RestAssured;

public class DynamicJson {
	public static void main(String[] args)
	 {
		RestAssured.baseURI="https://reqres.in";
		String response=given().log().all().header("Content-Type","application/json\r\n")
		.body(payload.AddBook())
		.when().post("/api/users")
		.then().assertThat().log().all().statusCode(200)
		.extract().response().asString();
		System.out.println(response);
	}

	
}
