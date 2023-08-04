package class03_conditions;

public class conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int p;
	p = 8;
	if (p==1) System.out.println("ONE");
	if (p==2) System.out.println("two");
	if (p==3) System.out.println("three");
	if (p==4) System.out.println("four");
	if (p==5) System.out.println("five");
	if (p==6) System.out.println("six");
	if (p==7) System.out.println("seven");
	if (p==8) System.out.println("eight");
	if (p==9) System.out.println("nine");
	
	       //Req: if age greater than 63 then print ("senior citizen"); 
	       // if not greater than 63 then print ("not senior citizen");
	int age;
	age = 50;
	if (age > 63) System.out.println("senior citizen");
	if (age < 63) System.out.println("not senior citizen");
	
	  //if salary is greater than 60.99 then print ("tax apply");
	  //                                     print ("tax is 30%);
	double empSalary; // camel case;
	empSalary = 60.99;
    if(empSalary > 70.99) {
	   System.out.println("tax apply");
	   System.out.println("tax is 30%");
    }
	else
	   System.out.println("no tax");
     //Req: if age is less than or equal to 12 then print "baby"
    
    age = 13;
    if (age <= 12) System.out.println("baby");
    if (age >= 13) System.out.println("adult");
    
    
    
    
         for(int i = 0; i<5;)
         {
         System.out.println("JAVA");
         
         
         }


   
	
	

	}
}
