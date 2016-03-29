package ahmed;

import java.util.Scanner;

public class DiceRoll {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);


		int myRoll;
		int comRoll;
		String playAgain ="yes";
			
			
			
while (playAgain.equals("yes")) {
		myRoll =  (int)(Math.random() * 5) + 1;
		comRoll = (int)(Math.random()* 5) + 1;

		if (myRoll < comRoll){
			System.out.println("My roll: " + myRoll + "" + "  Computer Roll:  " + comRoll);
			System.out.println(" You beat the computer");
		}

		else if (myRoll > comRoll){
			System.out.println("My roll: " + myRoll + "" + "  Computer Roll: " + comRoll);
			System.out.println(" The computer beat you ");
		}


		else if (myRoll == comRoll){
			System.out.println("My roll: " + myRoll + "" + "  Computer Roll: " + comRoll);
			System.out.println(" Tie Game  ");
			
			
		}
System.out.println(" Do you want to play again");
playAgain = scan.nextLine();
	}

	}



}


