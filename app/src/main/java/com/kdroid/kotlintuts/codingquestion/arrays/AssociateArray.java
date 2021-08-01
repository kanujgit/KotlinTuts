package com.kdroid.kotlintuts.codingquestion.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AssociateArray {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		map.put("1", "anuj");
		map.put("2", "anuj");
		map.put("3", "anuj");
		map.put("4", "anuj");
		Set<Entry<String,String>> sets =map.entrySet();
		List<Entry<String, String>> list = new ArrayList<>(sets);
		
//		for (Entry<String, String> entry : list) {
//			System.out.println(entry);
//		}
		for (int i = 0; i < list.size(); i++) 
        { 
            System.out.println(list.get(i).getKey()+":"+list.get(i).getValue()); 
        } 
	}

}
