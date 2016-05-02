package ahmed;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ahmed Ubah 
		// April 29 2016 
		// Guessing Game 
		//////////////////
		
	
		String[] roll = new String[] { "red", "orange", "yellow", "green", "blue", "violet", "white", "black", "pink", "brown", "gold",  "silver", "magenta", "coral", "peach", "aqua", "Beige","bronze", "burgandy", "carmel"};
		
		Scanner scan = new Scanner (System.in);

		// Declaring variables
		String yesNo;
		int counter = 0;
	
		String[] colour = { "red", "orange", "yellow", "green", "blue", "violet", "white", "black", "pink", "brown", "gold",  "silver", "magenta", "coral", "peach", "aqua", "Beige","bronze", "burgandy", "carmel"};
		boolean[] colours = new boolean [10];

	
		System.out.println("Thinking of a colour?.. enter Y for correct, N for incorrect");
		yesNo = scan.nextLine();

		
		while(yesNo.equalsIgnoreCase("Y")){
		if (yesNo.equalsIgnoreCase("Y")){
		for (int i=20; i>-1; i--){
		counter++;
		
		int cpuGuess = (int)(Math.random()*i);
		if (!colours[cpuGuess]){
		System.out.println("Is it " +colour[cpuGuess]+ " ? (Y/N)");
		yesNo = scan.nextLine();

		if (yesNo.equalsIgnoreCase("Y")){
		System.out.println("Congrats, you won in " + counter + " guesses!");
		
		i=0;
		}
		else if (counter==5)
		System.out.println("You have run out of guesses");
		{
		colours[cpuGuess]= true;
		}
		}
		}
		}  
		else 
		{

		}


		}
		}
		
		
		
		
		
		
		
	}


