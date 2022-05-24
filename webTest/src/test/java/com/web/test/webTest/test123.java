package com.web.test.webTest;

import java.util.ArrayList;
import java.util.Iterator;

public class test123 extends test12 {
	public void class1() {
		System.out.println("New Test");
	}
	
	public static void main(String[] args) {
		
		test123 test = new test123();
		test.class1();
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Name1");
		ar.add("Name2");
	
		
		String Value = "ayon";
	      Value.concat(" Haldar");
		System.out.println(Value);
		Iterator<String> it = ar.iterator();
		while(it.hasNext()) {
			Value = it.next();
			System.out.println(Value);
		}
	}
}
