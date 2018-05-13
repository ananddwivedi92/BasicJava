package com.learnjavabyanand;

import java.util.Scanner;

/**
 * @author Anand
 *
 */
public class Swapping {
	private static Scanner in;

	public static void main(String[] args) {
		int x, y, temp;
		System.out.println("Enter Character ");
		in = new Scanner(System.in);

		x = in.nextInt();
		y = in.nextInt();

		System.out.println("Before Swapping" + x);
		System.out.println("Before Swapping" + y);

		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swapping " + x);
		System.out.println("After Swapping " + y);
	}
}
