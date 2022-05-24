
public class Reverse_String {

	public static void main(String[] args) {
		
		//Using For Loop
		String s = "haldarAyonJamdara";
		int len = s.length();
		
		String rev = "";
		
		for(int i =len-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//Using StringBuffer
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		
	}
	

}
