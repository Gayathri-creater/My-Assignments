package week3.day1;

public class Chrome extends Browser {
	
	public void openIncognito() {
		System.out.println("open incognito mode");
	}
	
	public void clearCache() {
		System.out.println("cache cleared");
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chrome chromeOptions = new Chrome ();
		chromeOptions.openIncognito();
		chromeOptions.clearCache();
		chromeOptions.openURL();
		chromeOptions.closeBrowser();
		chromeOptions.navigateBack();
		
		

	}

}
