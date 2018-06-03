package com.learnjavabyanand;
import java.util.*;
/**
 * @author Anand
**/
public class CollectionInterface { 
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
	String name="Anand";
		/*
		    # ArrayList is a part of collection framework and is present in java.util package. 
		    # It provides us dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed.
			# ArrayList inherits AbstractList class and implements List interface.
			# ArrayList is initialized by a size, however the size can increase if collection grows or shrunk if objects are removed from the collection.
			# Java ArrayList allows us to randomly access the list.
			# ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases (see this for details).
		 */
		
		/*
		 # Java ArrayList class can contain duplicate elements. Java ArrayList class
		 # maintains insertion order. Java ArrayList class is non synchronized. Java
		 # ArrayList allows random access because array works at the index basis. In
		 #  Java ArrayList class, manipulation is slow because a lot of shifting needs to
		 #  be occurred if any element is removed from the array list.
		 */
	
		ArrayList <Object>list = new ArrayList<Object>(19);//Define size with 19 with accepting hetrogenious Object
		for(int i=0;i<4;i++) {
			list.add(i);//adding integer into list
		}
		
		for(int i=0;i<name.length();i++) {
			list.add(name.charAt(i));//adding String value
		}
		list.add(Boolean.TRUE);
		list.add(Boolean.FALSE);
		list.add(null);list.add(null);//try to add two times just to confirm to thrown NPE
		list.add(new Double("10.0"));//adding double
		list.add(new Float("10.0f"));//adding float
		
		//Iterate List based on Data Type Instance 
		for(Object obj:list) {
			if (obj instanceof Integer) {
				System.out.println("Integer :"+obj);
			}
			if (obj instanceof String) {
				System.out.println("String :"+obj);
			}
			if (obj instanceof Boolean) {
				System.out.println("Boolean :"+obj);
			}
			if (obj instanceof Double) {
				System.out.println("Double :"+obj);
			}
			if (obj instanceof Float) {
				System.out.println("Float :"+obj);
			}
		}
		list.set(0,"3");//set 3 into 0 index 
		ArrayList<Object> copy = (ArrayList<Object>) list.clone();//copy the exisintg object to new object 
		System.out.println("Cloning Object : "+copy);
		list.remove(0);//remove 0 from list
		System.out.println("Contains true ? : "+list.contains(Boolean.TRUE));
		System.out.println("Total List Size Before Clear "+list.size());
		list.clear();
		System.out.println("Total List Size Afer Clear "+list.size());
		
		
		/** <b> Linked List </b> **/
		/*
		 # Java LinkedList class can contain duplicate elements. Java LinkedList class
		 # maintains insertion order. Java LinkedList class is non synchronized. In Java
		 # LinkedList class, manipulation is fast because no shifting needs to be
		 # occurred. Java LinkedList class can be used as list, stack or queue.
		 */

		// Creating object of class linked list
		LinkedList object = new LinkedList();

		// Adding elements to the linked list
		object.add("A");
		object.add("B");
		object.addLast("C");
		object.addFirst("D");
		object.add(2, "E");
		object.add("F");
		object.add("G");
		LinkedList copyLinkedList = (LinkedList)object.clone();
		System.out.println("Linked list : " + object+"\n Newly Copied "+copyLinkedList);
		

		// Removing elements from the linked list
		object.remove("B");
		object.remove(3);
		object.removeFirst();
		object.removeLast();
		System.out.println("Linked list after deletion: " + object);

		// Finding elements in the linked list
		boolean status = object.contains("E");

		if (status)
			System.out.println("List contains the element 'E' ");
		else
			System.out.println("List doesn't contain the element 'E'");

		// Number of elements in the linked list
		int size = object.size();
		System.out.println("Size of linked list = " + size);

		// Get and set elements from linked list
		Object element = object.get(2);
		System.out.println("Element returned by get() : " + element);
		object.set(2, "Y");
		System.out.println("Linked list after change : " + object);
        
        
	}
}
class User {
	private int usernumber;
	private String userpassword;
	
	 User(int usernumber, String userpassword) {
		super();
		this.usernumber = usernumber;
		this.userpassword = userpassword;
	}
	public void setUsername(int usernumber) {
		this.usernumber = usernumber;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public int getUsername() {
		return usernumber;
	}
	public String getUserpassword() {
		return userpassword;
	}
	
}