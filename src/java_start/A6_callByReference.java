package java_start;

public class A6_callByReference {

	String name;
	int age;
	
	public void empInfo(A6_callByReference ob){
		ob.name = "abhi";
		ob.age = 20;
		System.out.println("object ob - name "+name);
		System.out.println("object ob - age "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A6_callByReference obj = new A6_callByReference();
		System.out.println("name value before calling method by ref "+obj.name);
		System.out.println("age value before calling method by ref "+obj.age);
		obj.empInfo(obj);
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

}
