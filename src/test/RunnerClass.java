package test;

public class RunnerClass {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.EmpId=4567;
		emp1.Salary=5000;
		//emp1.Department="Technology";
		emp1.display();	
		
		Employee emp2=new Employee(3214, 4000);
		emp2.display();
		
		Employee emp3=new Employee("Raj", 23, "Bhubaneswar", 123, 50000);
		emp3.display();
		
		//METHOD OVERLOADING
		PolymorphismExample obj1=new PolymorphismExample();
		//Compile time Polymorphism or Method Overloading, it allows us to have different parameters 
		obj1.add(12,18);
		obj1.add(5,5,7);
		obj1.add(12.3,34.6);
		
		Account objAccount = new Account();
		objAccount.setBalance(3000);
		System.out.println("Balance is: "+objAccount.getBalance());
		
		

	}

}
