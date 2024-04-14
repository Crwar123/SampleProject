package SamplePractice;

import java.util.Scanner;

public class If_Statement_Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("the age of voter");
		 * int age=sc.nextInt(); if (age>18) {
		 * System.out.println("The voter is elligible"); } else { System.out.println();
		 * } }
		 */
	
	Scanner s= new Scanner (System.in);
	System.out.println("Please enter the no");
	int n = s.nextInt();
	if (n%2==0) {
		System.out.println("The no. is Even");
	}
	else {System.out.println("the no is odd");}
}}
