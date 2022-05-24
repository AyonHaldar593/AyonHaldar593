
public class RemoveJunck_String {

	public static void main(String[] args) {
		
		String s = "ayon%^^haldar9876$$";
		
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));

	}

}
