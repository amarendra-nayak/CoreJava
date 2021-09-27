package test;

public class Person {
	public String Name;
	public int Age;
	public String City;
	
	//We want person class as a "Parent" class of the "Employee" Class
	public Person() {
		
	}
	
	public Person(String name, int age, String city) {
		this.Name=name;
		this.Age=age;
		this.City=city;
	}
	
	public void display() {
		System.out.println("Name is: "+Name);
		System.out.println("Age is: "+Age);
		System.out.println("City is: "+City);
		
	}

}
