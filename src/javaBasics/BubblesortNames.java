package javaBasics;

import java.util.ArrayList;
import java.util.Collections;

public class BubblesortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> students = new ArrayList<String>();
		students.add("Martina");
		students.add("Leo");
		students.add("Martin");
		students.add("Theo");
		students.add("David");
		students.add("Oleg");
		students.add("Chemmy");
		students.add("Viktor");
		students.add("Basti");

		Collections.sort(students); // Sort cars
		for (String i : students) {
			System.out.println(i);
		}

	}
}
