
public class MainDemo {

	public static void main(String[] args) {
	  Checking checking;
	  checking = new Checking("joe",1111,12.00);
	  checking.printAcc();     
      
      System.out.println();
      
      Saving saving;
      saving = new Saving("joe",1111,8.00);
      saving.printAcc();
	}

}
