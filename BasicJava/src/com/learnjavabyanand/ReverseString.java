package com.learnjavabyanand;

/**
 * @author Anand
 * loop from last through each content from string and get character as per index 
 */
public class ReverseString {
	static String inputPayload = "Anand";

	public static void main(String[] args) {
		System.out.println("Input String is " + inputPayload + "\n" + "After Reverse Logic");
		for (int i = inputPayload.length() - 1; i >= 0; i--) {
			System.out.print(inputPayload.charAt(i));
		}
	}
}
