package week3.day1;

public class OverRiding extends PolyMorphism {
	public void takeSnap() {
	super.takeSnap();
		System.out.println("Snap clicked");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverRiding ride = new OverRiding();
		ride.takeSnap();

	}

}
