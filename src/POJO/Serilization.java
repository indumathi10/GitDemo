package POJO;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Serilization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddPlace P=new AddPlace();
		P.setAccuracy(50);
		P.setAddress("29, side layout, cohen 09");
		P.setLanguage("French-IN");
		P.setWebsite("http://google.com");
		P.setName("Frontline house");
		P.setPhone_number("(+91) 983 893 3937");
		
		List<String>mylist=new ArrayList<String>();
		mylist.add("shoe park");
		mylist.add("shop");
		P.setTypes(mylist);
		
		location l=new location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		
		P.setLocation(l);
		
		
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		Response res=given().log().all().queryParam("key","qaclick123")
				.body(P)
			    .when().post("/maps/api/place/add/json")
			    .then().assertThat().statusCode(200).extract().response();
		
		String responseString=res.asString();
		System.out.println(responseString);
		
		
		
	}

}
