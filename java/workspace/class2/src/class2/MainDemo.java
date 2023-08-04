package class2;

public class MainDemo {

	public static void main(String[] args) {
		// declare an object named camery with data type car
		car camery; 
		//create camery object by the car () method
		camery =  new car(4,"Red");// instantiate camery object by car mathod
		System.out.println("the " + camery.door + " door camerys color is " + camery.color);
        
		car corolla;
		corolla = new car (2, "green");
		System.out.println("the " + corolla.door + " door corollas color is " + corolla.color);
		
		
	}

}
