package class33;

public class Fruit {
    private String Name;
    private double Price;
    private String Color;
    Fruit(String Name,double Price,String Color){
        this.Name=Name;
        this.Price=Price;
        this.Color=Color;  
    }   
       void setName(String Name) {
    	 this.Name=Name;
     }
     String getName() {
    	 return this.Name;
     }
       void setPrice(double Price) {
    	 this.Price=Price;
     }
     double getPrice() {
    	 return this.Price;
     }
      void setColor(String Color) {
    	 this.Color=Color;
     }
     String getColor() {
    	 return this.Color;
     }
	
}
    

