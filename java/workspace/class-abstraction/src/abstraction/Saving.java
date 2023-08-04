package abstraction;

public class Saving extends Account {
    double tax;
    
    Saving(String name, int phone, double tax){
    	super(name,phone);
    	this.tax=tax;
    }

	void clacFee() {
		System.out.println("Saving Fee: 5% tax + 1% of transaction");	
	}
}
