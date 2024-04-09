package com.example.labexam02;
import java.util.Scanner;

public class labexam02 {

	private static int UPDATE_PAINTING= 786;
	private static int REPORT_PAINTING= 787;
	private static int QUIT_PROGRAM= 788; 
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to management system of painting");
		Scanner scanner= new Scanner(System.in);
	    
		System.out.println(UPDATE_PAINTING+" -Update painting");
		System.out.println(REPORT_PAINTING+" -Report painting");
		System.out.println(QUIT_PROGRAM+" -Quit program");		     
	    
		int option;
		
		do {
			
			System.out.println("Enter artist name: Komal");
			System.out.println("Enter paint type: Acrylic");
			
			System.out.println("Enter option");
			option= scanner.nextInt();		   
					  
		    switch(option) {
			case 786: System.out.println("UPDATE_PAINTING");
			    break;
			case 787:  System.out.println("REPORT_PAINTING");
				break;
			case 788:  System.out.println("QUIT_PROGRAM");
				break;
				default:
			System.out.println("Invalid Input");
						}	
			}while(option!=QUIT_PROGRAM);
		System.out.println("Program run by: Komalpreet");
		scanner.close();
		}
}

		
