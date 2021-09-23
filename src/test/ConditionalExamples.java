package test;

import java.util.Scanner;

public class ConditionalExamples {
public static void main(String[] args) {
		
		//Checking Even and Odd
		for(int i=1;i<=50;i++) {
			if(i%2==0)
				System.out.println(i+" is Even Number");
			else
				System.out.println(i+" is Odd Number");
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age: ");
		int age=sc.nextInt();
		if(age>=18)
			System.out.println("You are Eligible for voting!");
		else if(age==17)
			System.out.println("You are Eligible for voting next year!");
		else
			System.out.println("Sorry you are Not Eligible for voting!");
		sc.close();

	}


}
