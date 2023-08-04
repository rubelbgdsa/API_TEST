package interfaceQuiz16;

public class rectangle implements Shape{
    private double height;
    private double width;
    
    public rectangle (double height, double width) {
    	this.height=height;
    	this.width=width;
    }
    
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		double area = (height*width);
		return area;
	}

	public double perimeter() {
        double perimeter = 2*(height+width);
		return perimeter;
	}



 
}
