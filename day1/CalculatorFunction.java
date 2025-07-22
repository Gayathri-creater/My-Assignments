package week3.day1;

public class CalculatorFunction {
	
	public void addNumbers(int a,int b) {
		System.out.println(a+b);
	}
	public void addNumbers(int a, int b,int c){
		System.out.println(a+b+c);
	}
	public void addNumbers(float a,float b) {
		System.out.println(a+b);
}
	public static void main(String[] args) {
		
		CalculatorFunction calcOptions = new CalculatorFunction();  
		
		calcOptions.addNumbers(1.5f, 2.5f);
		calcOptions.addNumbers(1, 2);
		calcOptions.addNumbers(1, 2, 3);
	}
}
