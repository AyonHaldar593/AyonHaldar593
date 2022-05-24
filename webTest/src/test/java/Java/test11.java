package Java;

import java.util.HashSet;
import java.util.Set;

public class test11 {

	public static void main(String[] args) {
		
		String str = "aaabbbccc";
		String value1 =str.substring(0, 3);
		String value2 = str.substring(3, 6);
		String value3 = str.substring(6, 9);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		String names[]= {"AA","BB","CC","AA","DD","BB"};
		Set<String> store = new HashSet<String>();
		for(String name:names) {
			if(store.add(name)==false) {
				System.out.println("Duplicate - "+name);
			}
			
		}
		System.out.println(store);
	}

}
