package interf;

class Bicycle implements Vehichle {
    public int gear = 2;
    public int speed = 30;
	public void changeGear(int gear) {
		this.gear=gear;
	}
	public void speedUp(int speed) {
	    this.speed=speed;	
	}
	public void applyBrakes(int brakes) {
		this.speed=speed - brakes;		
	}
    void display() {
    	System.out.println("Bicycle present state :");
    	System.out.println("Update gear of Bicycle :"+gear);
    	System.out.println("Update speed of Bicycle :"+speed);
    }
}