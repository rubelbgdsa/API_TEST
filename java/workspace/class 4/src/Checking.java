             //how to connect account with checking 
public class Checking extends Account{ //child class
  double fee;
  Checking(String name, int phone, double fee){
	  super(name,phone);//super means main class constructor
	  this.fee=fee;
  }
  void printAcc() {
	  System.out.println("Checking Name: "+ this.name);
	  System.out.println("Checking Phone: "+ this.phone);
	  System.out.println("Checking Fee: "+ this.fee);
  }
}
