package java_start;

public class Car {
	
	String name;

	String color;

	int price;

	static final int wheels = 4;
	
	public char getGender(){
		System.out.println("get gender");
		char c = 'a';
		return c;
	}

	public static void main(String[] args) {

	Car c1 = new Car();
	c1.name = "BMW";
	c1.color = "white";
	c1.price = 80;
	//System.out.println(c1.wheels);
	System.out.println(Car.wheels);
	System.out.println(wheels);
	//System.out.println(name);
	//c1.wheels = 8;
	//System.out.println(c1.wheels);
	//Car.wheels = 5;

	Car c2 = new Car();
	c2.name = "Audi";
	c2.color = "red";
	c2.price = 70;
	//System.out.println(c2.wheels);

	Car c3 = new Car();
	c3.name = "Honda";
	c3.color = "black";
	c3.price = 20;

	System.out.println("===========================");
	
	System.out.println(c1.getGender());
	System.out.println(("@@@@@@@@@@"));
	char c = c1.getGender();
	//System.out.println(c);
	
	}
}
