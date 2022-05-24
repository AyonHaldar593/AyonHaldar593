package Java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class test1 {

	public static void main(String[] args) {
		
		int[] arrayOne = {2, 2, 1, 3, 3, 6};
        Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        for (int i = 0; i < arrayOne.length; i++) {
            if (treeMap.containsKey(arrayOne[i])) {
                treeMap.put(arrayOne[i], treeMap.get(arrayOne[i]) + 1);
        } else{
            treeMap.put(arrayOne[i],1);
        }
    }
        System.out.println(treeMap);
    }

}
