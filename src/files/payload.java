package files;

public class payload {

	public static String Addplace() {
		// TODO Auto-generated method stub
             return"{\r\n"
             		+ "  \"location\": {\r\n"
             		+ "    \"lat\": -38.383494,\r\n"
             		+ "    \"lng\": 33.427362\r\n"
             		+ "  },\r\n"
             		+ "  \"accuracy\": 50,\r\n"
             		+ "  \"name\": \"Frontline house\",\r\n"
             		+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
             		+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
             		+ "  \"types\": [\r\n"
             		+ "    \"shoe park\",\r\n"
             		+ "    \"shop\"\r\n"
             		+ "  ],\r\n"
             		+ "  \"website\": \"http://google.com\",\r\n"
             		+ "  \"language\": \"French-IN\"\r\n"
             		+ "}\r\n"
             		+ "";
	}
	
	public static String Friends() {
		return"{\r\n"
				+ "\"name\": \"Chris\",\r\n"
				+ "\"age\": 23,\r\n"
				+ "\"address\": {\r\n"
				+ "  \"city\": \"New York\",\r\n"
				+ "  \"country\": \"America\"\r\n"
				+ "},\r\n"
				+ "\"friends\": [\r\n"
				+ "  {\r\n"
				+ "    \"name\": \"Emily\",\r\n"
				+ "    \"hobbies\": [ \"biking\", \"music\", \"gaming\" ]\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"name\": \"John\",\r\n"
				+ "    \"hobbies\": [ \"soccer\", \"gaming\" ]\r\n"
				+ "  }\r\n"
				+ "]\r\n"
				+ "}\r\n"
				+ "";
	}
	public static String names() {
	
		return "[\r\n"
				+ "{ \"name\": \"Chris\", \"age\": 23, \"city\": \"New York\" },\r\n"
				+ "{ \"name\": \"Emily\", \"age\": 19, \"city\": \"Atlanta\" },\r\n"
				+ "{ \"name\": \"Joe\", \"age\": 32, \"city\": \"New York\" },\r\n"
				+ "{ \"name\": \"Kevin\", \"age\": 19, \"city\": \"Atlanta\" },\r\n"
				+ "{ \"name\": \"Michelle\", \"age\": 27, \"city\": \"Los Angeles\" },\r\n"
				+ "{ \"name\": \"Robert\", \"age\": 45, \"city\": \"Manhattan\" },\r\n"
				+ "{ \"name\": \"Sarah\", \"age\": 31, \"city\": \"New York\" }\r\n"
				+ "]";
	}
	public static String AddBook() {
		String payload="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "";
		return payload;
	}

}
