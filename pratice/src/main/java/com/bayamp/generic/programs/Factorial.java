package com.bayamp.generic.programs;

import java.util.Scanner;
//import org.testng.annotations.Test;

import org.testng.annotations.Test;


public class Factorial  {


	public static void main(String[] args){
		Scanner enter =new Scanner(System.in);
		System.out.println("enter");

		int num = enter.nextInt();
		int factorial = factorial(num);

		System.out.println(+factorial);

		enter.close();
	}

	public static int factorial(int num) { 



		int result=1;
		for(int i = num; i >= 2; i--)
			result=result * i;

		return result;



	}

}
