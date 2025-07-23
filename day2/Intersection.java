package week3.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[] = {3, 2, 11, 4, 6, 7} ;
		int array2 [] = {1, 2, 8, 4, 9, 7};
		
		List <Integer> list1 = new ArrayList<>();
		List <Integer> list2= new ArrayList<>();    
		
		for(int num:array1) {
			list1.add(num);
		
		}
		for(int num1:array2) {
			list2.add(num1);
			
		}
		for (int i = 0; i < list1.size(); i++) {
			
			if(list2.contains(list1.get(i)));{
				System.out.println(list1.get(i));  
			}
			
			
		}
		

	}

}
