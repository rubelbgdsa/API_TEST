package abstraction;

public abstract class Account {
     String name;
     int phone;
     
     Account(String name, int phone) {
    	 this.name=name;
    	 this.phone=phone; 	 
     }
     abstract void clacFee(); 
}
