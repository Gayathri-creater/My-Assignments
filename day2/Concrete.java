package week3.day2;

public class Concrete implements DatabseConnection {
	public static void main(String[] args) {
		Concrete C1 = new Concrete();
		C1.connect();
		C1.disconnect();
		C1.executeUpdate();
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connect Method");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnect Method");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("executeUpdate Method");
		
	}

}
