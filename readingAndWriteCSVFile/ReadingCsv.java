package readingAndWriteCSVFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingCsv {
	public static void main(String[] args) throws IOException {
	BufferedReader bf=new BufferedReader(new FileReader("demoo.csv"));
	String line = bf.readLine();
	while(line!=null) {
		String [] values=line.split(",");
		for(String s:values) {
			System.out.print(s+" ");
		}
		System.out.println();
		line=bf.readLine();
	}
	
	}

}
