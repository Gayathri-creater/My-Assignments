package week3.day1;

public class LoginTestData extends TestData {
	public void enterUsername(String name) {
		System.out.println("user name is : " + name);
	}
public void enterPassword(String pass) {
	System.out.println("Password is: " + pass);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginTestData data1 = new LoginTestData();
		data1.enterCredentials();
		data1.navigateToHomePage();
		data1.enterUsername("Gayathri");
		data1.enterPassword("Gayu@123");
		
		
		

	}

}
