package map_assis_project;

import java.util.*;
public class MapProject {

	public static void main(String[] args) 
	{
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Luffy", 657);
		map.put("Shivam", 564);
		map.put("Petter", 888);
		System.out.println("The Elements of HashMap are:");
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+ m.getValue());
		}
		
	}
	
	
}
