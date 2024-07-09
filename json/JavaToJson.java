package json;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJson {
	public static void main(String[] args) throws IOException {
		Person p=new Person("ram", 22, "sakthiram@gmail.com");
		ObjectMapper om=new ObjectMapper();
		String json = om.writeValueAsString(p);
		System.out.println(json);
		BufferedWriter bw=new BufferedWriter(new FileWriter("java.json",true));
		bw.write(json);
		bw.flush();
		
		BufferedReader br=new BufferedReader(new FileReader("java.json"));
		String line = br.readLine();
		while(line!=null) {
			System.out.print(line);
			line=br.readLine();
		}
	}

}
