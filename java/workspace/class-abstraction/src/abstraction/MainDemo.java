package abstraction;

public class MainDemo {

	public static void main(String[] args) {
		Checking chk;
		chk = new Checking("joe",111,5.00);
		chk.clacFee();
		System.out.println();
		
		Saving sav;
		sav = new Saving ("joe",111, 8.50);
		sav.clacFee();

	}

}