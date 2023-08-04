package class03_conditions;

public class if_else_example {

	public static void main(String[] args) {
		
		// Req: if day value is 1 then print Mon
		
		int day;
		day=2;           // -1 0  1 2 3 4 5 6 7      8 9 14
		if(day==1) 
			System.out.println("Mon");
		if(day==2) 
			System.out.println("Tue");
		if(day==3) 
			System.out.println("Wed");
		if(day==4)
			System.out.println("Thu");
		if(day==5)
			System.out.println("Fri");
		if(day==6)
			System.out.println("Sat");
		if(day==7)
			System.out.println("Sun");
		
		
		day =2;
		if (day>=1 && day<=5)    //always use and when there is a range 
		    System.out.println("weekday");
		if (day==6 || day==7)    //always use for random value
			System.out.println("weekend");
		double num = -42937737.9d;

		System.out.println(num);

	
	}

}
