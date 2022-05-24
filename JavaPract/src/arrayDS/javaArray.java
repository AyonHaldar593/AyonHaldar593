package arrayDS;

import java.util.ArrayList;
import java.util.Iterator;

public class javaArray {

	public static void main(String[] args) {
		
		String name[]= {"Ayon","Tatai","Haldar"};
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		ArrayList<String> ar1 = new ArrayList();
		for(int i=0;i<100;i++) {
			ar1.add("Ayon"+i);
		}
		Iterator it = ar1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
