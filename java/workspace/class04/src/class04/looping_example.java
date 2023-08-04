package class04;

public class looping_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//req: print 3 times MicroTech
		
		//for (start 1; ends at 10; 1 increment
		
		
		//int i; = i variable declaration
		//i = 1; assignment statement
		// i++ means i=i+1
		
		
//		for (int i=1;    i<=20; i++ )
//			System.out.println("MicroTech");
//		for (int i=5;   i>=1; i--) {
//			System.out.println(i);
//		}
//		
//		//     i++;   //same as n=n=1
//		//     i+=2;   //same as n=n+2
//		//	   i+=5;   //same as n=n+5
//		
//		// print 1 to 5 using do loop
//		
//		
//		
//		
//		// for loop
//		
//		for (int i=1; i<=5; i++) {
//			System.out.println(i);
//		}
//		
//		
//		
//		//while loop
//		int i=1;
//		while (i<=5) {
//			System.out.println();
//			i++;
//		}
//		
//		
//		
//		//Do loop
//	
//		int n=1;
//		do {
//		  System.out.println(n); //loop body
//		  n++;
//		} while (n<=5);
		
		
		boolean isPrime=true;
		int n = 89;
	    
		for (int i=2; (i <=n/2); i++) {
		  if (n % 1==0) {
			isPrime = false;
			break;
		  }
		}
		
		if (isPrime == true)
			System.out.println("prime number");
		else 
			System.out.println("Not a prime number");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
