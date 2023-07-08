package com.info;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccurenceOfWord {

	public static void main(String[] args) {
		//occurence of word
		String s = "This this is is my java code code";
		String l = s.toLowerCase();
		String[] ss = l.split(" ");
		Map<String,Integer> m  = new LinkedHashMap<String,Integer>();
		for (int i = 0; i < ss.length; i++) {
			String a = ss[i];
			if(m.containsKey(a)) {
				Integer value = m.get(a);
				m.put(a, value+1);
			}
			else {
				m.put(a, 1);
			}
		}
		
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		String x = "Welcome To Yash Welcome";
        String[] ss1 = x.split(" ");
    
        Map<String,Integer> m1 = new LinkedHashMap<String,Integer>();
            int n=1;
        for(String a1: ss1){
            if(m1.containsKey(a1)){
                m1.put(a1,n+1);
            }
            else{
                m1.put(a1,n);
            }
        }
        Set<Entry<String,Integer>> s2 = m.entrySet();
        for(Entry<String,Integer> s3 : s2){
            System.out.println(s3.getKey()+" = "+s3.getValue()+" ");
        }
	}

}
