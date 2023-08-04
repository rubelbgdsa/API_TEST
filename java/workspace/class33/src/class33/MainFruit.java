package class33;

public class MainFruit {

	public static void main(String[] args) {
		 Fruit fruitDetails;     
	        
	      fruitDetails = new Fruit("Apple",3.0,"Red");
	         System.out.println("Name: " + fruitDetails.getName());
	         System.out.println("Price: "+ fruitDetails.getPrice());
	         System.out.println("Color: "+ fruitDetails.getColor());
	         System.out.println ("Values of Apple after updation");
	         fruitDetails.setName("Apple");
	         fruitDetails.setPrice(7.5);
	         fruitDetails.setColor("green");
	         System.out.println("Name: " + fruitDetails.getName());
	         System.out.println("Price: "+ fruitDetails.getPrice()); 
	         System.out.println("Color: "+ fruitDetails.getColor());
	}



}
