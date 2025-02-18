import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.ReUsableMethods;
import files.payload;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//validate if add place API is working as Expected
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
	String Response=given().log().all().queryParam("key","qaclick123")
		       .header("Content-Type","application/json")
		       .body(payload.Addplace())
		       .when().post("/maps/api/place/add/json")
		       .then().assertThat().statusCode(200)
		       .body("scope",equalTo("APP")).extract().response().asString();
	
	System.out.println(Response);
	JsonPath js=new JsonPath(Response);
	String placeId=js.getString("place_id");
	
	System.out.println(placeId);
	
	//update place
	String newAddress="Summer walk,Africa";
	
     given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
     .body("{\r\n"
     		+ "\"place_id\":\""+placeId+"\",\r\n"
     		+ "\"address\":\""+newAddress+"\",\r\n"
     		+ "\"key\":\"qaclick123\"\r\n"
     		+ "}")
     .when().put("maps/api/place/update/json")
     .then().assertThat().log().all().statusCode(200)
     .body("msg",equalTo("Address successfully updated"));
     
     //Get Place
    String getPlaceresponse= given().log().all().queryParam("Key", "qaclick123")
     .queryParam("place_id",placeId)
     .when().get("/maps/api/place/get/json")
     .then().assertThat().log().all().statusCode(200)
     .extract().response().asString();
  System.out.println(getPlaceresponse);
    
  
  //JsonPath js1= ReUsableMethods.rawToJson(getPlaceresponse);
  //JsonPath js1=new JsonPath(getPlaceresponse);
   // String actualAddress=js1.getString("address");
    
	//System.out.println(actualAddress);
	//Assert.assertEquals(actualAddress, newAddress);
    
    //Cucumber Junit,TestNG
    
    
    

     		
	
	}

}
