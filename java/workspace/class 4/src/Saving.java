
public class Saving extends Account {
   double tax;
   Saving(String name,int phone, double tax){
	   super(name,phone);
	   this.tax=tax;
   }
   void printAcc() {
	      System.out.println("Saving Name: "+ this.name);
	      System.out.println("Saving Phone: "+ this.phone);
		  System.out.println("Saving tax: "+ this.tax);
		  
	  }
}
