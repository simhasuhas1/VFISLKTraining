package com.vfislk.assignments;

import java.util.Scanner;

public class Sum_OddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int fn=1,limit,sum=0;
		
Scanner scan=new Scanner(System.in);
System.out.println("enter the upper limit of the numbers");
limit=scan.nextInt();

		for(int i=fn;i<=limit;i++)
		{
			int r=i%2;
			if(r%2==1)
			{
				sum=sum+i;
			}
		}
		
		System.out.println("the sum of odd numbers between "+fn+" and "+limit+" is"+sum);
	
	}

}
