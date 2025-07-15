package week2.day1;

public class Browser {
	
	public String launchBrowser(String browserName) {
		
		System.out.println("Browser launched successfully");
        return browserName;

		
		
	}
	
	public void loadUrl() {
		System.out.println("Application Url loaded successfully");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser val = new Browser();
		String str = val.launchBrowser("Google Chrome");
				System.out.println(str);
		val.loadUrl();
		
		

	}

}
