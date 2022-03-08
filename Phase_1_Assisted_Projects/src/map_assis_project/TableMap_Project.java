package map_assis_project;
import java.util.*;
import java.util.Map.Entry;
public class TableMap_Project {

	public static void main(String[] args) {
		TreeMap<String,Integer> oj = new TreeMap<String,Integer>();
		oj.put("Ajay",400);
		oj.put("Shunham",300);
		oj.put("Dilip",600);
		System.out.println("The Elements of TreeTable are:");
		for(Map.Entry j:oj.entrySet()) {
		System.out.println(j.getKey()+" "+j.getValue());
                             
	}

	}
}
