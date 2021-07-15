package com.vfislk.assignments;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fn=1,ln=30;
		
		System.out.println("The even numbers in the range "+fn+" and "+ln+" are");
		
		for(int i=fn;i<=ln;i++)
		{
			int n=i%2;
			if(n==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("The odd numbers in the range "+fn+" and "+ln+" are");
		for(int i=fn;i<=ln;i++)
		{
			int n=i%2;
			if(n==1)
			{
				System.out.println(i);
			}
		}

	}

}
