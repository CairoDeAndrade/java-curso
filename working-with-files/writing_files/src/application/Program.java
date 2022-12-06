package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		
		String path = "C:\\Users\\cairo\\programing\\workspaces\\test.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			System.out.println("Sucessfully writing on files!");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
