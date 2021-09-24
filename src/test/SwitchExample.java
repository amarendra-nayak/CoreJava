package test;

public class SwitchExample {

	public static void main(String[] args) {
		
		int age=10;
		
		switch(age) {
		case 18:
			System.out.println("Eligible");
			break;
		case 17:
			System.out.println("Will be Eligible next year");
			break;
		case 15:
			System.out.println("Ineligible");
			break;
		default:
			System.out.println("Default Block");
		}

	}

}
