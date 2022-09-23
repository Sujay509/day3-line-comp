package com.bridgelabz.LineComp;

import java.util.Scanner;

public class Uc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x1, x2, y1, y2,length;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x1 : ");
		x1 = sc.nextFloat();
		
		System.out.print("Enter the value of y1 : ");
		y1 = sc.nextFloat();
		
		System.out.print("Enter the value of x2 : ");
		x2 = sc.nextFloat();
		
		System.out.print("Enter the value of y2 : ");
		y2 = sc.nextFloat();
		
	
		
		length = (float)Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		
		System.out.print("Length is : "+length);
		sc.close();
	} 
	
}
	
		
		
		
