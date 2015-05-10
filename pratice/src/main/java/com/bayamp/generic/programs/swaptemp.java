package com.bayamp.generic.programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class swaptemp {

	
		@Test
	public static void test(String args[]){
		
		int x, y, temp;
		System.out.println("enter x and y");
		Scanner enter= new Scanner(System.in);
		
		x=enter.nextInt();
		y=enter.nextInt();
		
		temp = x;
		x = y;
		y =temp;

		System.out.println ("+X+\n +y");
		}	
		
		
	
		}
