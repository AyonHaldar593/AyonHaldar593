
public class DemoObj {
	
	int a = 100;
	int b = 200;
	
	public static void main(String[] args) 
	{
		
		DemoObj obj = new DemoObj();
		
		obj.sum();
		System.out.println("Valu of a "+obj.a);
		System.out.println("Valu of b "+obj.b);
	}
	public void sum()
	{
		int x=20;
		int y =100 ;
		int z = x+y ;
		System.out.println("The sum is - "+z);
	}
	
	public void sub()
	{
		int x=20;
		int y =100 ;
		int z = x-y ;
		System.out.println("The sum is - "+z);
	}

}
