/*
Antonio Gomez
CSE360 - 85141
Assignment 2

This assignment is designed to
practice using a version control system.
Such as Github or Bitbucket
*/

package cse360assign2;

import java.util.Scanner;

/*
The class AddingMachine, first creates a private int "total"
and also a String "equation".
It then has a constructor which initiates the two variables.
There are a few methods let you add or subtract from the total
which also creates an equation for you as well.
The toString function returns the built equation from the other methods.
It also has a main method at the end for testing. 
 */

public class AddingMachine {

	private int total;
	private String equation;
	
	//Constructor for the file AddingMachine
	//Sets total and equation to 0 to start.
	public AddingMachine () {
		
		total = 0;
		equation  = "0";
		
	}
	
	//The getTotal method returns the current total 
	public int getTotal () {
		
		return total; //returns the int total
	}
	
	//The add method adds the parameter to the total variable
	//It also adds the plus operator and the value entered
	//into the string equation
	public void add (int value) {
		
		total = total + value;
		equation = equation + " + " + value;
	}
	
	//The subtract method subtracts the parameter from the total variable
	//It also adds the minus operator and the value entered
	//into the string equation
	public void subtract (int value) {
		
		total = total - value;
		equation = equation + " - " + value;
	}
	
	/*
	A history of the transactions/calculations that is kept and 
	returned by the toString method. The history starts from 
	the initial 0 value to the last input in the equation. 
	 */
	public String toString () {
		
		return equation; //returns the string equation
	}

	//The clear function resets the total and equation back to 0 
	public void clear() {
		
		total = 0;
		equation = "0";
	
	}
	
	//The main method is used for testing to see if the AddingMachine works
	//properly, specifically the toString function.
	public static void main (String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		AddingMachine math = new AddingMachine();
		
		math.add (4);
		math.subtract (2);
		math.add(5);
		
		System.out.println("After a few adding and subtracting methods: ");
		System.out.println("equation: " + math.toString());
		System.out.println("total: " + math.getTotal());
		
		math.clear();
		
		System.out.println("After clearing the total and equation: ");
		System.out.println("equation: " + math.toString());
		System.out.println("total: " + math.getTotal());
		
	}
}
