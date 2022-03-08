package map_assis_project;

import java.util.*;

public class HashTable_Projects {

	public static void main(String[] args) {
		Hashtable<String,Integer> hm = new Hashtable<>();
		hm.put("kunak",444);
		hm.put("shiv",367);
		hm.put("Rudra",449);
		System.out.println("The Elements of Hashtable are:");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+ m.getValue());
		}

	}

}
