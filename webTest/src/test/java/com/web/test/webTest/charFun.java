package com.web.test.webTest;

public class charFun {

	public static void main(String[] args) {
		
		String text = "AcdFnG";
		
		char[] ch = text.toCharArray();
		for(int i =0;i<ch.length;i++) {
			System.out.println(ch[i]);
			if(ch[i]>=65 && ch[i]<=95)
			{
				System.out.println("Capital");
			}
			else
			{
				System.out.println("Not Capital");
			}
		}

	}

}
