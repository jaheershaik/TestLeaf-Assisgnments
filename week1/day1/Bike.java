package week1.day1;

public class Bike {
	
	public void driveBike() {
		System.out.println("driveBike");
	}
	public void applyBrake() {
		System.out.println("Apply Brake");
	}
	public void soundHorn() {
		System.out.println("Sound Horn");
	}
	public void isPuncture() {
		System.out.println("isPuncture");
	} 
	public static void main(String[] args) {
		Bike b = new Bike();
		b.applyBrake();
		b.driveBike();
		b.isPuncture();
		b.soundHorn();
	}

}
