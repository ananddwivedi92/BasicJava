package com.learnjavabyanand;
import java.util.*;

/**
 * @author Anand
 **/

/*
 	# Set is an interface which extends Collection. It is an unordered collection of objects in which duplicate values cannot be stored.
	# Basically, Set is implemented by HashSet, LinkedSet or TreeSet (sorted representation).
	# Set has various methods to add, remove clear, size, etc to enhance the usage of this interface
 */
public class CollectionSetInterface {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		/* HashSet
		# Underlying data structure for HashSet is hashtable.
		# As it implements the Set Interface, duplicate values are not allowed.
		# Objects that you insert in HashSet are not guaranteed to be inserted in same order. Objects are inserted based on their hash code.
		# NULL elements are allowed in HashSet.
		*/
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Anand");
		hashSet.add("Ajeet");
		hashSet.add("Antrish");
		hashSet.add("Anand");// adding duplicate elements
		System.out.println(hashSet);
		System.out.println("List contains Anand or not:" + hashSet.contains("Anand"));
		Iterator<String> i = hashSet.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		/*LinkedHashSet 
		 # Contains unique elements only like HashSet. It extends HashSet class and implements Set interface.
		 # Maintains insertion order.
		 */
		
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();

		// Adding element to LinkedHashSet
		linkedset.add("A");
		linkedset.add("B");
		linkedset.add("C");
		linkedset.add("D");
		 //This will not add new element as A already exists 
        linkedset.add("A"); 
        linkedset.add("E"); 
		System.out.println("Original LinkedHashSet:" + linkedset);
		System.out.println("Removing D from LinkedHashSet: " + linkedset.remove("D"));
		System.out.println("Checking if A is present=" + linkedset.contains("A"));
		System.out.println("Updated LinkedHashSet: " + linkedset);
		
		/* TreeSet
		 # Null insertion not allow
		 # TreeSet implements the SortedSet interface so duplicate values are not allowed.
		 # TreeSet does not preserve the insertion order of elements but elements are sorted by keys.
		 # TreeSet does not allow to insert Heterogeneous objects. It will throw classCastException at Runtime if trying to add hetrogeneous objects.
		 #  TreeSet is basically implementation of a self-balancing binary search tree like Red-Black Tree. Therefore operations like add, remove and search take O(Log n) time. And operations like printing n elements in sorted order takes O(n) time.
		 */
		TreeSet treeSet = new TreeSet();
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(3);// Duplicates will not get insert
		System.out.println(treeSet);
		//treeSet.add("A") ; //will throw ClassCastException at run time since it compare the value with previous data and if mismtach then CCE thrown
		//treeSet.add(null); // Throws NullPointerException
	}
}
