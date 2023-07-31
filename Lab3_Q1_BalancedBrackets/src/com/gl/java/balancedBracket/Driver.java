package com.gl.java.balancedBracket;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Bracket strings: ");
		String input = scanner.nextLine();
		scanner.close();

		boolean isBalanced = BalancedBrackets.isBalanced(input);

		if (isBalanced) {
			System.out.println("The String which you have entered is Balanced Brackets String !!!!");
		} else {
			System.out.println("The String which you have entered is Unbalanced Brackets String!!!!");
		}
	}
}



