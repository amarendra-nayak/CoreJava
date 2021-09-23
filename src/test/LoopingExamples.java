package test;

public class LoopingExamples {

	public static void main(String[] args) {

		//==========for() loop========================
				int i;
				for(i=1;i<=10;i++)
					System.out.println(i);
				
				//==========while() loop======================
				int x=1;
				while(x<=10) {
					System.out.println(x);
					x++;
				}
				//Printing a number in reverse order
				int n1=123456;
				int count=0;
				while(n1>0) {
					int r=n1%10;
					System.out.println(r);
					count++;
					n1=n1/10;
				}
				System.out.println("The number of digits are: "+count);
				
				//=============do-while() loop====================
				int n2=10;
				do {
					System.out.println(n2);
					n2--;
				}while(n2>0);


	}

}
