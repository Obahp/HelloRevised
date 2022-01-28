package week3;

import java.util.Scanner;

public class HelloWorldRevised {
	
	 public static void main(String[] args) {
		 
		 Scanner in = new Scanner(System.in); // to get an input from user 
		 
		 System.out.println("Good afternoon! Welcome to Support");
		 System.out.println("Who do you want to chat with? Robot or Human?"); 
		 String chat = in.nextLine();
		 
		 System.out.println("Thank you for selecting "+ chat +  " We need to verify your credentials");
		 
		 System.out.println("Please enter your name:");
		 String name = in.nextLine();
		 System.out.println("Hello " + name + "!");
		 
		 System.out.println("How old are you?");
		 int age = Integer.parseInt(in.nextLine());
		 	
		 
		 System.out.println("What is your Nationality?"); 
		 String from = in.nextLine();
		 			 
		 System.out.println("What is your favourite color?");
		 String color = in.nextLine();
		 
		 System.out.println("What is your best dessert?");
		 String dessert = in.nextLine();
		 System.out.println(name + " i hope you like coding Java as much as you like to eat " + dessert);
		 
		 System.out.println("Thank you "+ name + " for your answers, one of our technicians will be with you shortly..." );
		
		 in.close(); // to close scanner in error that is showing above. 
	 }
}
