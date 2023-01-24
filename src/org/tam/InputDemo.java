package org.tam;

import java.util.Scanner;

public class InputDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.What is your Name?");
		String name = scanner.nextLine();
		System.out.println("Ans : Hello" +  name);
		System.out.println("2. What is your rating ?");
	   int rating = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ans : you rated as "+ rating);
		System.out.println("3.What is your email?");
		String mail = scanner.nextLine();
		System.out.println("Ans : anandhakumar9751@gmail.com ");
	}

}
