package week3.day1;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Overloading {
	public void reportStep (String message, String status) {
		System.out.println("Message is : " + message + " " + status);
	}
		public void reportStep (String message, String status, boolean snapshot) {
			System.out.println("Messsage is " + message + "" + status + "" + snapshot );
			
			public static void main(String[] args) {
				Overloading body = new Overloading();
				body.reportStep("Hello", "message Sent");
				body.reportStep("Hello World", "photo has not taken", false);
				
				
			
			
		}

	}
	

}
