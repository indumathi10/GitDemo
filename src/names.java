import files.payload;
import io.restassured.path.json.JsonPath;

public class names {

	public static void main(String[] args) {
		JsonPath js=new JsonPath(payload.names());
		int count =js.getInt("name.size()");
		System.out.println(count);

		String names=js.getString("name");
		System.out.println(names);
           //comment is added
                System.out.println("names");
		
		for(int i=0;i<count;i++) {
			String name=js.get("["+i+"].name");
			if(name.equalsIgnoreCase("Kevin")) {
				int age=js.getInt("["+i+"].age");
				System.out.println(age);
				break;
			}
			
		}
	}

}
