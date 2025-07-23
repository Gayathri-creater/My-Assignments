package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] =  {3, 2, 11, 4, 6, 7};
		List <Integer> list1 = new ArrayList<>();
		for(int num:array) {
			list1.add(num);
		}
		System.out.println("Actua1 List: " + list1);
		Collections.sort(list1);
		System.out.println("Sorted List: " + list1);
		System.out.println("second Largest number in the list:  " + list1.get(list1.size()-2));
		
		
 
	}

}
