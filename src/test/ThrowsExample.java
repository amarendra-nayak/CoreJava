package test;

public class ThrowsExample {

	public static void main(String[] args) {
		
		// If we are using throws statement we are forcing the calling function to handle it
		//or else they can also use throws. So, at least at one place we need to handle the exception
			ThrowsExample obj=new ThrowsExample();
			obj.calculator();

	}
	public void calculator() {
		try{
			div();
		}catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void div() throws ArithmeticException{
		System.out.println("Inside Div Method");
	}

}
