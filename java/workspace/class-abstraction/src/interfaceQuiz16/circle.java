package interfaceQuiz16;

public class circle implements Shape {
	private double radius;


	public circle (double radius) {
		
		this.radius = radius;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public double getArea() {
		double area = 3.1416*radius*radius;
		
		return area;
	}

	public double perimeter() {
		double perimeter = 2*3.1416*radius;
		return perimeter;
	}
	 
}
