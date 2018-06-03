package com.learnjavabyanand;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
/**
 * @author Anand
**/
public class CollectionMapInterface {

	/* 
	 # A Map cannot contain duplicate keys and each key can map to at most one value. 
	 # Some implementations allow null key and null value (HashMap and LinkedHashMap) but some do not (TreeMap).
	 
	*/
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		/* HashMap
		 * HashMap adds data as key value pair.
		 * HashMap Decide order based on hashing function.
		 * Duplicate Key's are not allow but key and value as null is allowed
		 * internally it checks for hashcode and equals method when we put element 
		 */
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("A", new Integer(100));
		hashMap.put("B", new Integer(200));
		hashMap.put("C", new Integer(300));
		hashMap.put("D", new Integer(400));

		// Returns Set view
		Set<Map.Entry<String, Integer>> st = hashMap.entrySet();

		if (hashMap.containsKey("A")) 
        {
            Integer a = hashMap.get("A");
            System.out.println("value for key \"A\" is:- " + a);
        }
		
		for (Map.Entry<String, Integer> me : st) {
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
		hashMap.clear();//clear the hashmap
		
		
		/* SortedMap
		 # The main characteristic of a SortedMap is that, it orders the keys by their natural ordering, or by a specified comparator. 
		 # So consider using a TreeMap when you want a map that satisfies the following criteria:
		 # null key or null value are not permitted.
		 # The keys are sorted either by natural ordering or by a specified comparator. 
		 */
		
		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
		sm.put(new Integer(2), "practice");
		sm.put(new Integer(3), "quiz");
		sm.put(new Integer(5), "code");
		sm.put(new Integer(4), "contribute");
		Set s = sm.entrySet();

		// Using iterator in SortedMap
		Iterator i = s.iterator();

		// Traversing map. Note that the traversal
		// produced sorted (by keys) output .
		while (i.hasNext()) {
			Map.Entry m = (Map.Entry) i.next();

			int key = (Integer) m.getKey();
			String value = (String) m.getValue();

			System.out.println("Key : " + key + "  value : " + value);
		}
		
		/*NavigableMap
		# NavigableMap is an extension of SortedMap which provides convenient navigation method like lowerKey, floorKey, ceilingKey and higherKey,.
		# popular navigation method it also provide ways to create a Sub Map from existing Map in Java
		*/
		NavigableMap<String, Integer> nm = new TreeMap<String, Integer>();
		nm.put("C", 888);
		nm.put("Y", 999);
		nm.put("A", 444);
		nm.put("T", 555);
		nm.put("B", 666);
		nm.put("A", 555);

		System.out.printf("Descending Set  : %s%n", nm.descendingKeySet());
		System.out.printf("Floor Entry  : %s%n", nm.floorEntry("L"));
		System.out.printf("First Entry  : %s%n", nm.firstEntry());
		System.out.printf("Last Key : %s%n", nm.lastKey());
		System.out.printf("First Key : %s%n", nm.firstKey());
		System.out.printf("Original Map : %s%n", nm);
		System.out.printf("Reverse Map : %s%n", nm.descendingMap());
		
		
		/*ConcurrentHashMap
		 # ConcurrentHashMap is Thread-safe in nature.
		 # ConcurrentHashMap performance is low sometimes because sometimes Threads are required to wait on ConcurrentHashMap
		 # While one thread is Iterating the HashMap object, if other thread try to add/modify the contents of Object then we will get Run-time exception saying ConcurrentModificationException.
		 # Whereas In ConcurrentHashMap we wont get any exception while performing any modification at the time of Iteration.
		 */
		ConcurrentHashMap<Integer, String> l = new ConcurrentHashMap<Integer, String>();
		l.put(100, "A");
		l.put(101, "B");
		l.put(102, "C");
		

		for (Object o : l.entrySet()) {
			Object ss = o;
			System.out.println(s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(l);
		
		/*LinkedHashMap
		    # A LinkedHashMap contains values based on the key. It implements the Map interface and extends HashMap class.
			# It contains only unique elements (See this for details)..
			# It may have one null key and multiple null values (See this for details).
			# It is same as HashMap with additional feature that it maintains insertion order. For example, when we ran the code with HashMap, 
		 */
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("one", "practice.geeksforgeeks.org");
		lhm.put("two", "code.geeksforgeeks.org");
		lhm.put("four", "quiz.geeksforgeeks.org");

		// It prints the elements in same order as they were inserted
		System.out.println(lhm);

		System.out.println("Getting value for key 'one': " + lhm.get("one"));
		System.out.println("Size of the map: " + lhm.size());
		System.out.println("Is map empty? " + lhm.isEmpty());
		System.out.println("Contains key 'two'? " + lhm.containsKey("two"));
		System.out.println(
				"Contains value 'practice.geeksforgeeks.org'? " + lhm.containsValue("practice.geeksforgeeks.org"));
		System.out.println("delete element 'one': " + lhm.remove("one"));
		System.out.println(lhm);
	}
	
}
