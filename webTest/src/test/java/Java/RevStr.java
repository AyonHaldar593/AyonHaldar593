package Java;

public class RevStr {

	public static void main(String[] args) {
		
		String str = "HelloWorld";
		String revStr = "";
		for(int i =str.length()-1;i>=0;i--) {
			revStr = revStr+str.charAt(i);
		}
		System.out.println(revStr);
		StringBuffer stf = new StringBuffer(str);
		StringBuffer rev = stf.reverse();
		System.out.println(rev);
	}
}
