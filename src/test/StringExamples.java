package test;

public class StringExamples {

	public static void main(String[] args) {
		
		String Fname="Amarendra";
		String Lname="Nayak";
		String FullName= Fname+" "+Lname;
		
		System.out.println("FullName is : "+FullName);
		System.out.println("Length of FullName is: "+FullName.length());
		System.out.println("FullName in UPPER CASE: "+FullName.toUpperCase());
		
		String NewName=FullName.replace(" ", ",");
		System.out.println("NewName is: "+NewName);

	}

}
