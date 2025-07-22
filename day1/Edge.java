package week3.day1;

public class Edge extends Browser {
	public void takeSnap() {
		System.out.println("take a snap");
	}
	
	public void clearCookies() {
		System.out.println("cookies cleared");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Edge A = new Edge();
		
A.openURL();
A.closeBrowser();
A.navigateBack();
A.takeSnap();
A.clearCookies();
	}

}
