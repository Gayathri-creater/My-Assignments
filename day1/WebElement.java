package week3.day1;

public class WebElement {
	
	public void click() {
		System.out.println("Click the Element");
	}

	public void setText(String text) {
		System.out.println("Text is: " + text);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElement element = new WebElement();
		element.click();
		element.setText("Inheritance");
		

	}

}
