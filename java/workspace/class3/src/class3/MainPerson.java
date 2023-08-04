package class3;

public class MainPerson {

	public static void main(String[] args) {
	  Person joe;
	  joe = new Person(1,"Joe dovella",917257);
	  System.out.println("ID:" + joe.id);
	  System.out.println("Name:" + joe.name);
	  System.out.println("Phone:" + joe.phone);	  
	  System.out.println();
	  Person maria;
	  maria = new Person(2,"Maria Rahman",347658);
	  System.out.println("ID:" + maria.id);
	  System.out.println("Name:" + maria.name);
	  System.out.println("Phone:" + maria.phone);

	}

}
