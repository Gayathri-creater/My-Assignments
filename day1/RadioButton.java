package week3.day1;

public class RadioButton extends Button{
	
	public void SelectRadioButton () 
	{
		System.out.println("Radio button is selected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RadioButton R = new RadioButton();
		R.click();
		R.setText("RadioButton");
		R.SelectRadioButton();
		R.submit();


	}

}
