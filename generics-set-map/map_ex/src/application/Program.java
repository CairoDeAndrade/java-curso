package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import entities.Candidate;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Map<Candidate, Integer> canditadesMap = new HashMap<>();
		
		System.out.print("Enter file full path: ");
		String path = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String item = br.readLine();
			
			while (item != null) {
				String[] fields = item.split(",");
				
				Candidate candidate = new Candidate(fields[0], Integer.parseInt(fields[1]));
				canditadesMap.put(candidate, candidate.getNumberOfVotes());
			}
			
			for (Candidate candidate : canditadesMap.keySet()) {
				System.out.println(candidate.getName() + ": "  + canditadesMap.get(candidate));
			}
			
		} 
		catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			sc.close();
		}
		
	}

}
