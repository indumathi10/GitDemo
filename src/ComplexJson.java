
import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonPath js1=new JsonPath(payload.Friends());
		int count =js1.getInt("friends.size()");
				System.out.println(count);
				
				String name=js1.getString("friends.name");
				System.out.println(name);
				int count1=2;
				for(int i=0;i<count1;i++) {
					String friendsname=js1.getString("friends["+i+"].name");
					
				System.out.println(friendsname);
			System.out.println(js1.get("friends["+i+"].hobbies").toString());
				}


	}
	
	

}
