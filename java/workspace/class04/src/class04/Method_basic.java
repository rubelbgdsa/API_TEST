package class04;

public class Method_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//req: prrint dallas 5 times 
		printDallasTimes();
		
		//req: print tampa 5 times 
		printTampa5Times();
		
		//req: print arizona 5 times
		printArizona5Times();
		
		//req: print dallas 5 times 
		printDallasTimes();
		
		//req print tampa 5 times
		printTampa5Times();
		
		//req: print arizona 5 times
		printArizona5Times();
		

	}//main
                     //must be camel casing
	public static void printDallasTimes() {
		for (int i=1; i<=5; i++)    //method body
			System.out.println("Dallas");
	}
	public static void printTampa5Times() {
		for (int i=1; i<=5; i++)    //method body
			System.out.println("Tampa");
	}
	public static void printArizona5Times() {
		for (int i=1; i<=5; i++)    //method body
			System.out.println("Arizona");
	}
	
	
	
	
}//class