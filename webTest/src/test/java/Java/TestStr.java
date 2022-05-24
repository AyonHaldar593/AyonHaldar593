package Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestStr {

	public static void main(String[] args) {
		
		String str = "AAABBBCCCDDD";
		String [] names= {"AA","BB","CC","AA"};
		
		System.out.println(str.substring(0, 3));
		System.out.println(str.substring(3, 6));
		System.out.println(str.substring(6, 9));
		
		Set<String> store = new HashSet<String>();
		for(String name : names) {
			if(store.add(name)==false) {
				System.out.println("The duplicate -"+name);
			}
		}
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Ayon");
		ar.add("Ayon1");
		ar.add("Ayon");
		System.out.println(ar);
		if (ar.contains("Ayon")) {
			System.out.println("Ayon is present");
		}

	}

}
