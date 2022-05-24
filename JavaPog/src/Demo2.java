import java.util.ArrayList;



public class Demo2{

	public static void main(String[] args) {
		//DemoObj obj1 = new DemoObj();
		//obj1.sum();
		//obj1.sub();
		
		ArrayList obj = new ArrayList();
		obj.add(90892);
		obj.add("Mobile Number");
		obj.add("Ayon");
		System.out.println(obj);
		int siz = obj.size();
		for(int i=0;i<siz;i++)
		{
			System.out.println(obj.get(i));
		}
		
		ArrayList objn = new ArrayList();
		objn.add(19273);
		objn.add("Mobile Number");
		objn.add("haldar");
		
		System.out.println(objn);

	}

	private static char[] obj(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
