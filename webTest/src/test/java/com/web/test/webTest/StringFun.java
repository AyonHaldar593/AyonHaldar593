package com.web.test.webTest;

import java.util.HashSet;
import java.util.Set;

public class StringFun {

	public static void main(String[] args) {
		
		String data = "Selenium Automation Testing - Java Selenium";
		
		// String data1 = data.replaceFirst("Java", "Javadoc");
		String [] names = {"Ayon" , "Tatai", "Ayon" ,"Tatai" ,"Data" , "Data1","Data1","newdata"};
		Set<String> store = new HashSet<String>();
		for(String name : names ) {
			if(store.add(name)==false) {
				System.out.println(name);
			}
		}

	}

}
