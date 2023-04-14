package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;


public class main_misc {
    //private static HashMap<String,String> cache = new HashMap<>();
	public static void main(String[] args) {
	   
	  
		String a = "pale";
		String b = "ple";
		
		String c = "pale";
		String d = "elape";
		
		System.out.println(one_away(a,b));
		System.out.println(one_away(c,d));
		
	}
	
	private static int one_away(String s1,String s2){
		
		//Case 1:
		if(s1.equals(s2)){
			return 1;
		}
		
		//Case 2:
		if(s1.length() == s2.length()){
			
			int c = 0;
			for(int i = 0;i < s1.length();i++){
				String x = s1.substring(i,i+1);
				String y = s2.substring(i,i+1);
				
				if(x.equals(y)){
					c++;
				}
			}
			if(c <= 1) {
				return 1;
			}
		}
		
		//Case 3:
		if(s1.length() == s2.length() -1 || s2.length() == s1.length() -1){
			
			String s = s1+s2;
			HashMap<String,Integer> h = new HashMap<>();
			
			for(int i = 0;i < s.length();i++) {
				String x = s.substring(i,i+1);
				if(h.containsKey(x)){
					h.replace(x,h.get(x)+1);
				}
				else {
					h.put(x,1);
				}
			}
			
			String not =  "";
			int c = 0;
			for(int i = 0;i < s.length();i++) {
				String x = s.substring(i, i+1);
				if(h.get(x) % 2 != 0) {
					not = x;
					c++;
				}
			}
			
			if(c <= 1){
				
				String a = "";//s1 without not
				
				for(int i = 0;i < s1.length();i++){
					String x = s1.substring(i, i+1);
					if(x.equals(not)) {
						continue;
					}
					a += x;
				}
				
				String b = "";//s2 without not
				
				for(int i = 0;i < s2.length();i++){
					String x = s2.substring(i, i+1);
					if(x.equals(not)) {
						continue;
					}
					b += x;
				}
				
				if(a.equals(b)) {
					return 1;
				}				
			}		
		}
		return 0;
		
	}	
	
	
	}
	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

