package POJO;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;

public class sampleJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SampleTest S=new SampleTest();
        S.setJob("leader");
        S.setName("morpheus");
        S.setSalary(3455666.7);
        
		RestAssured.baseURI="https://reqres.in/";
		String res=given().log().all()
		.body(S)
		.when().post("api/users")
		.then().assertThat().statusCode(201).extract().response().asString();
		
		
		System.out.println(res);
		
		Data sample=given().header("Content-Type","application/json")
				.when().get("https://reqres.in/api/users/2").as(Data.class);
		System.out.println(sample.getData().getFirst_name());
		System.out.println(sample.getSupport().getUrl());
	}	

}
