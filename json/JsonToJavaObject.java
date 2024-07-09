package json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaObject {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper om=new ObjectMapper();
		BufferedReader br=new BufferedReader(new FileReader("java.json"));
		System.out.println(br);
		Person value = om.readValue(br, Person.class);
		System.out.println(value);
		
	}

}
