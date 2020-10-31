package com.syntax.class07;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		// we are playing a lottery and a lucky number is 17;
		// we want to keep asking user any number from 1-20
		// until he guess the lucky number --> congrat
		
		Scanner scan;
		long number;
		long luckyNumber=17;
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Please enter any number from 1 to 1000000");
			number=scan.nextLong();

		}while(number!=luckyNumber);
		
		System.out.println("You got it!!!!!!");
		
	}
}
