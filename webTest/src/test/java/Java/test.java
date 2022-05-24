package Java;

import java.awt.Desktop.Action;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		
		String str = " java string interview questions and answers ";
		
		//System.out.println(str.length());
		//System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("i", 9));
		
		//System.out.println(str.substring(0, 4));
		//System.out.println(str.trim());
		//System.out.println(str.replace(" ", ""));
		
		//String test = "Ayon_Haldar_712410_Jamdara";
		//String value[] =test.split("_");
		//for(int i=0 ; i<test.length();i++)
		//{
		//	System.out.println(value[i]);
		//}
		
		
		String Value = "ayon";
		String value= Value.concat(" Haldar");
		System.out.println(value);
		
		String name[] = {"Ayon","Tatai","New","Tatai","Ayon","Soumi"};
		Set<String> store = new HashSet<String>();
		for(String names:name) {
			if(store.add(names)==false) {
				System.out.println(names);
				
				
				
			}
			
		}
		System.out.println(store);
	}

}
