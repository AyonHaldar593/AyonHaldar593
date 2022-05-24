package arrayDS;

public class string {

	public static void main(String[] args) {
		
		String Str = "AAABBBCCCDDD";
		
		
		StringBuffer sbf = new StringBuffer(Str);
		
		System.out.println(sbf.reverse());
		System.out.println(sbf.delete(1, 2));
		System.out.println(sbf.length());
		sbf.delete(2, 5);
		System.out.println(sbf);

	}

}
