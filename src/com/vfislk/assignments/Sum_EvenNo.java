package com.vfislk.assignments;

public class Sum_EvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fn=1,ln=50,sum=0;
		
		for(int i=fn;i<=50;i++)
		{
			int r=i%2;
			if(r%2==0)
			{
				sum=sum+i;
			}
		}
		
		System.out.println("the sum of even numbers between "+fn+" and "+ln+" is"+sum);
	
	
	if(sum%2==0)
	{
		System.out.println(""+sum+"is an even number");
	}
	else
	{
		System.out.println(""+sum+"is an odd number");
	}

}
}