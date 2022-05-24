package com.web.test.webTest;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		
//		int [] array = new int [3];
//		array[0]=40;
//		array[1]=5;
//		array[2]=10;
//		for (int i=0;i<array.length;i++)
//		{
//			System.out.println(array[i]);
//		}
		
		ArrayList ar = new ArrayList();
		
		ar.add("23");
		ar.add(12);
		ar.add("123");
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
			
		}
		if(ar.contains(12))
		{
			System.out.println("Yes");
		}
	}

}
