package javaUtill.exam;

import java.util.*;

public class ListExam2 {
	
	public List<String> addArray(String[]arr1, String[]arr2){
		List<String> list = new ArrayList<String>();
		
		for(String str : arr1){
			System.out.println(str);
			list.add(str);
		}
		for(String str : arr2){
			System.out.println(str);
			list.add(str);
		}
		return list;
	}
	
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		for(int i=0; i<list.size(); i++){
			String str = list.get(i);
			System.out.println(str);
		}
	}

}
