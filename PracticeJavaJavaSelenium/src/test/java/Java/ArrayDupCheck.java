package Java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayDupCheck {

	public static void main(String[] args) {
	    String [] names = new String [5];

	    Scanner get = new Scanner (System.in);

	    for (int i=0; i<names.length; i++) {
	        System.out.println("Enter Name In This Array Of String ");
	        names[i] = get.nextLine();  // Here
	    }
	    
	    Set <String> store = new HashSet<String>();
	    for(String name:names) {
	    	if(store.add(name)==false) {
	    		System.out.println(name+" This is duplicate");
	    	}
	    	
	    }
}
	
}