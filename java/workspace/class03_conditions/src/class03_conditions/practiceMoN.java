package class03_conditions;

public class practiceMoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//IF ELSE LADDER
		
		int day;
		day=2;           //if (day==1) system.out.println("Mon");
		if(day==1)       //else system.out.println("not Mon");
			System.out.println("Mon");
		else if(day==2) 
			System.out.println("Tue");
		else if(day==3) 
			System.out.println("Wed");
		else if(day==4)
			System.out.println("Thu");
		else if(day==5)
			System.out.println("Fri");
		else if(day==6)
			System.out.println("Sat");
		else if(day==7)
			System.out.println("Sun");
		else 
			System.out.println("invalid day");

	}

}
