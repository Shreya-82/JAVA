package collection.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(); 
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(55,66,78));
		Vector<Integer> v1 = new Vector<>();
		System.out.println(list2);
		list1.add(10);
		list1.add(11);
		list1.add(1);
		list1.add(5);
		list1.add(2,70); //move the element at 2nd index
		list1.set(2, 18); //replace the element at 2nd index
		System.out.println(list1.contains(30));
		list1.removeIf(x->x%2==0); //if it is a even no remove it
//		System.out.println(list1);
//		for(int i=0; i<list1.size();i++) {
//			System.out.println(list1.get(i));
//		}
		for(int x: list1) {
			System.out.println(x);
		}
	}

}
