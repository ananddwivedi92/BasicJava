package com.learnjavabyanand;

/**
 * @author Anand
 *
 */
public class SingleTone {
	private static SingleTone singletoneObject;

	// restrict to create Object apart from this class
	private SingleTone() {
	}

	static {
		singletoneObject = new SingleTone();// load while compiling the class
	}

	// return current class instance
	public static SingleTone getInstance() {
		return singletoneObject;
	}

	public void testSingleTone() {
		System.out.println(singletoneObject + " object is Created ");
	}

	public static void main(String a[]) {
		SingleTone singleTone = getInstance();
		singleTone.testSingleTone();
		singleTone.testSingleTone();// It will return same reference for all Object means it is SingleTone

	}
}
