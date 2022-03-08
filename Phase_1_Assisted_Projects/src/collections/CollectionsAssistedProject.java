package collections;

import java.util.*;

public class CollectionsAssistedProject {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		ArrayList<String>city = new ArrayList<String>();
		city.add("Kolkata");
		city.add("Mumbai");
		System.out.println(city);
		
		System.out.println();
		
		System.out.println("Vector");
		Vector<Integer> vec = new Vector<Integer>();
		vec.addElement(68);
		vec.addElement(778);
		System.out.println(vec);
		System.out.println();
		System.out.println("LinkedList");
		LinkedList<String> name = new LinkedList<String>();
		name.add("John");
		name.add("Shivam");
		System.out.println(name);
		Iterator<String> itr = name.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println();
			
			System.out.println("HashSet");
			HashSet<Integer> set = new HashSet<Integer>();
			set.add(408);
			set.add(333);
			set.add(657);
			System.out.println(set);
			
			System.out.println();
			
			System.out.println("linkedHashSet");
			LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
			set2.add(56);
			set2.add(78);
			set2.add(90);
			System.out.println(set2);
			
		}
		

	}

}
