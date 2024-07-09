package json;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JavaToJsonWithoutInBuilt {
	
	public static String toJson(Person person) {
		StringBuilder json = new StringBuilder();
        json.append("{\n");
        json.append("  \"name\": \"").append(person.getName()).append("\",\n");
        json.append("  \"age\": ").append(person.getAge()).append(",\n");
        json.append("  \"email\": \"").append(person.getEmail()).append("\"\n");
        json.append("}");
        return json.toString();
	}
	
	public static void main(String[] args) throws IOException {
		Person p=new Person("Ram", 23, "ramkumar@gmail.com");
		String json = toJson(p);
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("java.json",true));
		bw.write(json);
		bw.flush();
		System.out.println(json);
	}

}
