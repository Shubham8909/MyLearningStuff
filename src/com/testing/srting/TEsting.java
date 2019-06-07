package com.testing.srting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class TEsting {
	
	
	public static void main(String[] args) {
		
		/*
		 * ArrayList<Integer> l = new ArrayList<>(); l.add(1); l.add(2); l.add(3);
		 * l.add(4);
		 */
		ConcurrentHashMap <String, Integer>	 map= new ConcurrentHashMap <>();
	map.put("s", 1);
	map.put("v",2);
	map.put("m", 1);
	map.put("c",2);
	
             Iterator<String> it = map.keySet().iterator();
             while(it.hasNext()) {
            	 
            	 String str= it.next();
            	 System.out.println(str +": "+map.get(str));
            	  map.put("d", 20);
             }

	}
		
}
