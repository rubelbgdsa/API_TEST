package interf;

public class MainDemo {

	public static void main(String[] args) {
		Bicycle B;
		B = new Bicycle();
		B.changeGear(3);
		B.speedUp(100);
		B.applyBrakes(10);

		B.display();
		bike b;
		b = new bike();
		b.changeGear(3);
		b.speedUp(70);
		b.applyBrakes(10);

		b.display();

	}

}
