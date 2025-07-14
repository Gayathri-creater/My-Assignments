package week1.day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number");
		int num;
		num=sc.nextInt();
		
		//int num2=num;
		int rev=0;
		while(num!=0)
		{
		    rev=rev*10 +num%10;
			num=num/10;
		}
		System.out.println(rev);
		

	}

}
