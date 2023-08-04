package abstraction;

public class Checking extends Account{
     double charge;
     
     Checking(String name, int phone, double charge){
    	 super(name,phone);
    	 this.charge=charge;
     }

	void clacFee() {
		System.out.println("Checking Fee: 2% charge + 1% of balance");
		
	}
    
}
