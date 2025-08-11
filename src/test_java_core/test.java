package test_java_core;

import java.util.Iterator;

public class test {

	public static void main(String[] args) {

		String largeString = "This is a very long string...".repeat(10000);

		for (int i = 0; i < largeString.length(); i++) {
			char currentChar = largeString.charAt(i);
			System.out.print(currentChar);
			
			if (i==500) {
				System.out.println("");

				System.out.print("____Read More____");
				break;
			}

	
		}

	
	}
}
