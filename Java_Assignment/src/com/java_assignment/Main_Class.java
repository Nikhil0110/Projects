package com.java_assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class Main_Class {
	public void loadQuestions(String fileName) throws IOException {
		FileReader fr = new FileReader(System.getProperty("user.dir") + "\\csv_files\\matches.csv");
		BufferedReader br = new BufferedReader(fr);
		int count = 0;
		String line;
		
		Hashtable h = new Hashtable();
		h.put("Royal Challengers Bangalore", 0);
	
		while ((line = br.readLine()) != null) {
			String arr[] = line.split(",");
			int value = 0;
			 
				if (arr[7].equals("field") &&  arr[1].equals("2017")) {
					count++;
					if (!h.contains(arr[6])) {
						h.put(arr[6], 0);
					}
					 h.get(arr[6]);
					//h.replace(arr[6],  ++value);
				}
			
			 
				if (arr[7].equals("field") &&  arr[1].equals("2017")) {
					
					//System.out.println(h.get(arr[6]));
				}
			

		}
		System.out.println(h);
		System.out.println(count);

	}

	public static void main(String[] args) throws IOException {
		Main_Class main = new Main_Class();
		main.loadQuestions(" ");
		

	}
}
