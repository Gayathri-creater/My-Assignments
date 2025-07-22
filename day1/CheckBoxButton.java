package week3.day1;

public class CheckBoxButton extends Button {
	public void clickCheckButton() 
	{
		System.out.println("CheckBox Button is selected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxButton c = new CheckBoxButton();
		c.click();
		c.setText("CheckBoxButton");
		c.clickCheckButton();
		

	}

	
}
