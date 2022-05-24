package Java;

import java.util.*;
public class collectionN {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("Ayon");
		list.add(123);
		
		System.out.println(list);
		for (int i =0;i<list.size();i++)
		{
			System.out.println(list.get(i));
			if (list.get(i).equals(123))
			{
				list.remove(i);
				System.out.println(list);
			}
		}
	}

}
