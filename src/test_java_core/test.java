package test_java_core;

import java.util.Iterator;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		String largeString = "This is a very long string...".repeat(1000);

		for (int i = 0; i < largeString.length(); i++) {
			
			char currentChar = largeString.charAt(i);
			System.out.print(currentChar);
			
			if (i==500) {
				System.out.println("");

				System.out.println("____Read More____");

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Want to read more Y:N: ");
		        String content = scanner.nextLine();
				
		        if (content.equals("Y") || content.equals("y")) {
					System.out.println(currentChar);

				}
		        else if (content.equals("N") || content.equals("n")) {
		        	return;
				}
		        
		        
			}
				
		}

	
	}
}
