package com.vfislk.datatypes;

public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=65;
		
		if(marks>=90)
		{
			System.out.println("GradeA");
		}
		else if(marks>=80 && marks<90)
		{
			System.out.println("GradeB");
		
		}
		else if(marks>=60 && marks<80)
		{
			System.out.println("GradeC");
		
		}
		else if(marks<60)
		{
			System.out.println("Grade F");
		
		}

	}

}
