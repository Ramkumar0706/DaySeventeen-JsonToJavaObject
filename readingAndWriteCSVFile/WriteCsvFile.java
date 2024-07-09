package readingAndWriteCSVFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class WriteCsvFile {
	
	public static void main(String[] args) throws IOException {
		String s1="103,jerry,23";
		String s2="102,tom,21";
		String s3="101,Ram,22";
		
		BufferedWriter bf=new BufferedWriter(new FileWriter("demoo.csv",true));
		bf.write(s1);
		bf.newLine();
		bf.write(s2);
		bf.newLine();
		bf.write(s3);
		bf.newLine();
		bf.write("Thank you");
		bf.newLine();
		bf.flush();
		
		System.out.println("Data inserted Successfully");
		
	}

}
