package week3.day1;

public class Safari extends Browser {
	
	public void readerMode() {
		System.out.println(" Open Readermode");
	}
	public void fullScreenMode() {
		System.out.println("Open full screenmode");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Safari B = new Safari();
		B.openURL();
		B.closeBrowser();
		B.navigateBack();
		B.readerMode();
		B.fullScreenMode();  

	}

}
