package test;

public class ArrayExamples {

	public static void main(String[] args) {
		
		int[] array1= {10,11,20,25,22,18};
		String str1="Clean India";
		String reverseStr = "";
		String str2="We are going to split this string";
		
		//Accessing a particular element of array
		System.out.println("First Element:"+array1[0]);
		System.out.println("Third Element:"+array1[2]);
		
		System.out.println("Length of the Array is: "+array1.length);
		System.out.println("Element preset at the last index of the Array is: "+array1[array1.length-1]);
		
		System.out.println("The Array Elements are: ");
		int i;
		for(i=0;i<array1.length;i++)
			System.out.println(array1[i]);
		
		//It's a kind of for-each loop, but we can't use indexing and other stuffs like that
		System.out.println("Using other kind of for loop: ");
		for(int values:array1)
			System.out.println(values);
		
		//=====================================================================
		System.out.println("The Array Elements in reverse order are: ");
		for(i=array1.length-1;i>=0;i--)
			System.out.println(array1[i]);
		
		//======================================================================
		for(int j=0;j<str1.length();j++)
			System.out.println(str1.charAt(j));
		
		for(int j=str1.length()-1;j>=0;j--)
			reverseStr += str1.charAt(j);
		
		System.out.println("Reverse of the string is : "+reverseStr);
		
		//========================================================================
		System.out.println("The string is: "+str2);
		String[] words=str2.trim().split(" "); 
		//Split(" ") splits the entire string based on white space
		//trim()is a built-in function that eliminates leading and trailing spaces
		System.out.println("Total number of words in the string is: "+words.length);
		

	}

}
