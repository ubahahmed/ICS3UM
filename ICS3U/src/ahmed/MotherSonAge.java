package ahmed;

import java.util.Scanner;

public class MotherSonAge {
	
	

		public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);	
				// Variables
			String mothersName;
			String childName;
				int mothersAge ; // MOthers current age
				int childAge; // Child current age
				int birthMothersAge; // Mothers age when she gave birth to the child
				
				// Input
				System.out.println("What is your mothers name");
				mothersName = myInput.nextLine();
				System.out.println("what is your name");
				childName = myInput.nextLine();
				System.out.println("What is your mothers age");
				mothersAge = Integer.parseInt(myInput.nextLine());
				
				System.out.println("What is your age");
				childAge = Integer.parseInt(myInput.nextLine());
				
				// processing
				// Calculating Mothers age when she gave birth
				birthMothersAge = mothersAge - childAge;
				System.out.println(mothersName + " was " + birthMothersAge + " years old when she gave birth to "+ childName);
				
				
				
				
		}

	}

	
	
	
	


