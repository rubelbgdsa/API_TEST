package class04;

public class switch_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//	  int day;
//	  day = 2;
//	  //use if-else
//	  if (day==1 || day==2 || day==3 || day==4 || day==5)
//		System.out.println("Weekday");
//	  else if (day==6 || day==7)
//		System.out.println("weekend");
//	  else 
//		System.out.println("invalid day");
//	  
	  //limitation of swich: can not use range value after case
	  
	  //use switch                  :colon :semi-colon
//	  
//	  switch (day) {         
//	  case 1:
//	  case 2:
//	  case 3:
//	  case 4:
//	  case 5:
//		  System.out.println("weekday");
//		  break;
//	  case 6:
//	  case 7:
//		  System.out.println("weekday");
//		  break;
//	  default:
//		  System.out.println("invalid day"); 
//	  }	  
     // homework
		  //req: use switch
		  //if number is 0 then print "zero"
		  //if number is 1 then print 'one"
		  //if number is 2 then print "two"
		  //......
		  //if number is 9 then print "nine"
	
	   
	     int number;
	     number = 1;
	  
	     switch (number) {
	     case 0:
	       System.out.println("zero");
	       break;
	     case 1:
	       System.out.println("one");
	       break;
	     case 2:
	       System.out.println("two");
	       break;
	     case 3:
	       System.out.println("three");
	       break;
	     case 4:
	       System.out.println("four");
	       break;
	     case 5:
	       System.out.println("five");
	       break;
	     case 6:
	       System.out.println("six");
	       break;
	     case 7:
	       System.out.println("seven");
	       break;
	     case 8:
	       System.out.println("eight");
	       break;
	     case 9:
	       System.out.println("nine");
	       break;
	   }
	  

	}

}
