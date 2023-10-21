package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		scaner();
		Buf_filered();
		writer();
		}
	
	
	public static void scaner() {
		File file = new File("C:\\Users\\User\\eclipse-workspace\\lucas_1\\ola.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		}catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

	public static void Buf_filered() {
		String path = "C:\\\\Users\\\\User\\\\eclipse-workspace\\\\lucas_1\\\\tchau.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
				}
	public static void writer() {
		String[] lines = new String[] {"ti amo", "ti quero", "ti adoro"};
		String path = "C:\\\\Users\\\\User\\\\eclipse-workspace\\\\lucas_1\\\\ps.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
