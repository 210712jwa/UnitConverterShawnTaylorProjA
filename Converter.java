package main;
import java.util.*;
public class Converter {
	

	
	public Converter () {
	}
			public static void main(String []args) {
				
				
				
	
				
				
				
				///////////////////////
				int choice;
				String selection;
				
				
				
				double inches = 1;
				double centimeter=2.54;//////centimeter is = to 2.54///////
				
				int cups = 1;
				double pint=0.5;////// U.S. liquid pint/////////
				
				int meter =1;
				double kilometer=0.001;/////a kilo is equal to 0.001//
	
				double choice1 = inches * centimeter;
				double choice2 = cups * pint;
				double choice3 = meter * kilometer;

				
				/////////////////////////Scanners
				
				
				System.out.println("Menu---Please Select an Option...NOW!!! Convert::");
				System.out.println("*************************************************");
				System.out.println("1. Inches to Centimeter");
				System.out.println("2. Cups to Pint ");
				System.out.println("3. Meter to Kilometer");
				System.out.println("4. Quit");			
				System.out.println("**************************************************");
				
				
				/////////////////////////////////////
				int menuSelection=0;
				while (menuSelection !=4) {

				Scanner in = new Scanner (System.in);
				
				System.out.println("Enter a value of inches:");
				inches = in.nextInt();
				System.out.println(inches +  "is" +  centimeter +  "centimeters");
				
				System.out.println("Enter a value of cups:");
				cups = in.nextInt();
				System.out.println(cups + "is"   + pint +  "pints");
				
				System.out.println("Enter a value of Meter:");
				meter = in.nextInt(); 
				System.out.println(meter  +  "is"  + kilometer +   "kilometer" );
				//////////////////////////
				
				choice = in.nextInt();
				switch (choice) 
				{ 
				
				case 1:
					 System.out.println(choice1  +  "Inches to Centimeters");
					break;
						
				case 2:
					System.out.println(choice2  +  "Cups to Pints");
					break;
					
				case 3:
					System.out.println(choice3  +  "Meter to Kilometer");
					break;
					
				case 4:
					default:
						selection="Just stop";
						
				System.out.println("Your conversion" + selection);
				
						

				
						
					
				
		
	
	// If we do not use the break keyword, it is known as fall through
	
	
	/* 	1. Feet to Yards
		2. Miles to Kilometers
		3. US Gallons to Imperial Gallons
		4. Quit*/
	
	
	
	
				}
	
			}
			
			
}

}