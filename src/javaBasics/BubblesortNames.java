package javaBasics;

import java.util.ArrayList;
import java.util.Collections;

public class BubblesortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> students = new ArrayList<String>();
		students.size();
		students.add("Martina");
		students.add("Leo");
		students.add("Martin");
		students.add("Theo");
		students.add("David");
		students.add("Oleg");
		students.add("Chemmy");
		students.add("Viktor");
		students.add("Basti");
		for (int i=0; i <= students.size()+1; i++) {
		if (students.get(0).compareTo(students.get(1)) > 0) {
			Collections.swap(students, 0, 1);
			 };
			 int[] zahl = { 9, 5, 1, 4, 6, 3, 2, 8, 0 };
				for (int j = 0; j < zahl.length-1;j++) { 
					for (students.get(i).compareTo(students.get(i+1)) {
						if (zahl[i] > zahl[i + 1]) { 
							int x = zahl[i];
							zahl[i] = zahl[i + 1];
							zahl[i + 1] = x;
						}
					}
		}
		System.out.println(students.get(0));	
		System.out.println(students.get(1));	
		System.out.println(students.get(2));	
		System.out.println(students.get(3));	
		System.out.println(students.get(4));	
		System.out.println(students.get(5));	
		System.out.println(students.get(6));	
		System.out.println(students.get(7));	
		System.out.println(students.get(8));	
		
		
		
		}

	}

