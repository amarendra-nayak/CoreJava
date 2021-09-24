package test;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetExample {

	public static void main(String[] args) {
		//Set doesn't allow duplicate values.
		//It allows "NULL", and if we are adding more than one NULL, it's also considered as duplicates
		
		//=================HashedSet=============================================
		HashSet<String> set1=new HashSet<String>();
		set1.add("name1");
		set1.add("name2");
		set1.add("name3");
		set1.add("name4");
		set1.add("name1");
		set1.add(null);
		set1.add(null);
		
		System.out.println(set1);
		
		//========================LinkedHashSet=================================
		
		LinkedHashSet<String> set2=new LinkedHashSet<String>();
		set2.add("name1");
		set2.add("name2");
		set2.add("name3");
		set2.add("name1");
		
		System.out.println(set2);

	}

}
