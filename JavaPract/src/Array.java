import java.util.ArrayList;
import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Ayon");
		ar.add("Babai");
		ar.add("Tatai");
		ar.add("Arka");
		
		String s ="";
		Iterator<String> it = ar.iterator();
		while(it.hasNext()) {
			s= it.next();
			System.out.println(s);
			StringBuffer sf = new StringBuffer(s);
			System.out.println(sf.reverse());
		}
			
	}

}
