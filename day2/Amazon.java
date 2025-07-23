package week3.day2;

public class Amazon extends CanaraBank {



	

	@Override
	public void cashOnDelivery() {
		System.out.println("Payment method is COD");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upiPayments() {
		System.out.println("Payment method is UPI");

		
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		
		System.out.println("Payment method is Card payment");

		
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		
		System.out.println("Payment method is Internet banking");

		
	}
	
	public void recordPaymentDetails() {
		super.recordPaymentDetails();
		System.out.println("Record for canara Bank payment Details");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Amazon a1 = new Amazon();
		a1.cardPayments();
		a1.cashOnDelivery();
		a1.internetBanking();
		a1.upiPayments();    

	}
	}
