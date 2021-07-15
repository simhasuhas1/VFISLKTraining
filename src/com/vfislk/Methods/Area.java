package com.vfislk.Methods;

public class Area {
	
	public static double area_triangle(int base,int height)
	{
		double area=0.5*base*height;
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=25,h=1;
		
		System.out.println(Area.area_triangle(b,h));
		
		

	}

}
