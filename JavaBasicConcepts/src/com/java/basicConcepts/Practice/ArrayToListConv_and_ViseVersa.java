package com.java.basicConcepts.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.stream.Collectors;

public class ArrayToListConv_and_ViseVersa {

	public static void main(String[] args) {
		Integer[] value  = new Integer[5];
		value[0]=1;
		value[1]=2;
		value[2]=3;
		value[3]=4;
		value[4]=5;
		
		System.out.println("Array to List");
		
		List<Integer> listValue = Arrays.asList(value);
		System.out.println(listValue);
		
		System.out.print("\n");
		
		System.out.println("Java 8 way of doing");
		List<Integer> val =  Arrays.stream(value).collect(Collectors.toList());
		System.out.println(val); 
		
		System.out.print("\n");
		
		System.out.println("List to Array");
		 List<String> animals= new Vector<>();
	        animals.add("Dog");
	        animals.add("Horse");
	        animals.add("Cat");
	        Object[] valuesStr = new String[animals.size()];
	        valuesStr =  animals.toArray();
	        System.out.println(valuesStr[1]);
	        
	        System.out.println("Java 8 way of doing");
			
	        String[] strVal =animals.stream().toArray(String[]::new);
	        System.out.println(strVal[1]);
	        
	        List<String> stackVla = new Stack<String>();
		       
	}

}
