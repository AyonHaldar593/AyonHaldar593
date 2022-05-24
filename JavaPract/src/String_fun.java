import java.util.HashSet;
import java.util.Set;

public class String_fun {

	public static void main(String[] args) {
		
		String s = "Jamdara-Hooghly";
		String rev = "";
		int len = s.length();
		for(int i =len-1 ; i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		//System.out.println(rev);
		String [] ar = {"A","B","C","A"};
		Set<String> st = new HashSet<String>();
		for(String ar1:ar) {
			if(st.add(ar1)==false) {
				System.out.println("duplicate -"+ar1);
			}
		}
		System.out.println(st);
	}

}
