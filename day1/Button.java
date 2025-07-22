package week3.day1;

public class Button extends WebElement {
	
	public void submit() {
		System.out.println("Submitted");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Button B = new Button();
		B.click();
		B.setText("Button");
		B.submit();
		
		

	}

}
