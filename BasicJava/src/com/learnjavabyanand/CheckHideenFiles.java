package com.learnjavabyanand;

import java.io.*;

/**
 * @author Anand
 *
 */
public class CheckHideenFiles {
	public static void main(String[] args) {
		try {
			File file = new File("C:/users/ananddw/codeDetails.txt");
			if (file.isHidden()) {
				System.out.println(file.getName() + " is Hidden File");
			} else {
				System.out.println(file.getName() + " File is not Hidden ");
			}
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
