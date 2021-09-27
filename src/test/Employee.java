package test;

public class Employee extends Person{
	public int EmpId;
	public int Salary;
	static String Department="Technology";
	
	
	//Constructor
	//-Constructor will never have a return type as it don't return anything
	//-Constructor name is same as of the class name
	public Employee(){
		super();//It refers to the parent classes constructor
		System.out.println("Inside Emp Cons");
	}
	
	//Parameterized Constructor
	public Employee(int empId, int salary) {
		
		this();
		//or
		this.EmpId=empId;
		this.Salary=salary;
	}
	
	public Employee(String name, int age, String city, int empId,int salary) {
		
		super(name,age,city);
		this.EmpId=empId;
		this.Salary=salary;
	}
	
	public void display() {
		
		super.display(); //Run time Polymorphism or Method Overriding
		System.out.println("Emp Id is: "+EmpId);
		System.out.println("Salary is: "+Salary);
		System.out.println("Dep is "+Employee.Department);
		
	}
}
