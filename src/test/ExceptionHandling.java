package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		//int a=10;
		int b[]= {1,2,3};
		try {
			//System.out.println(a/0);
			System.out.println(b[1]);
			
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("Inside Null Pointer");
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Inside Arithmetic Exception");
		}catch(Exception e) {
			/*
			-If we don't know what might be the exception, then we can give Exception class
			-Exception catch block should be at the end of all other catch blocks, or else
			they will be unreachable.
			*/
			e.printStackTrace();
			System.out.println("Exception class");
		}finally {
			//It's a block which will always get executed irrespective of you get exception or not
			System.out.println("Inside Finally");
		}
		
		System.out.println("After Exception");

	}

}
