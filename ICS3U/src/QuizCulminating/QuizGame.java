// Ahmed Ubah 
// Technology culminating 2016
// Due: June 20 2016
package QuizCulminating;
import java.util.*;
import java.lang.Math ;
public class QuizGame {



	public static void main(String[] args) {
		// Scanner
		Scanner myInput= new  Scanner(System.in); 

		// welcome to game
		System.out.println("Welcome to the Quiz Bowl");

		// Picking A subject 
		System.out.println("\n" + "Please enter the name of the subject you wish to be quizzed on" + " \n" + "Biology" + " \n" + "Math" + "\n" +"technology");



		// storing variables
		String subject= myInput.next();
		int totalPoints = 0; 
		int grandTotal= 0;
		

		// Checking which subject was chosen and sending the user to the start of those questions
		if ( subject.equalsIgnoreCase("Math"))
		{
			totalPoints= MathSubject(totalPoints);
		}
		else if (subject.equalsIgnoreCase("biology"))
		{

			totalPoints= BiologySubject(totalPoints);
		}
		else if ( subject.equalsIgnoreCase("technology"))
		{

			totalPoints= TechnologySubject(totalPoints);



		}
		else 
			System.out.println("invalid answer");      

		grandTotal = grandTotal + totalPoints;
	
	
		while (true)

		{
		
			// Do you want to play again?
		{System.out.print("\n You now have " + grandTotal + " points. Would you like to contiune? Please indicate as a Yes or No answer.");

		String answer= myInput.next();

			//if they want to play again, the game starts over
			
		{ if (answer.equalsIgnoreCase("no"))
			{
				System.out.print("\n  Thanks for playing !");
			}


			else if	(answer.equalsIgnoreCase("yes"))		  

				System.out.println("\n" + "Please enter the name of the subject you wish to be quizzed on");
			subject = myInput.next();
			totalPoints = 0; 
			// Checking user input and directing user to proper method for each corresponding subject 

			if ( subject.equalsIgnoreCase("Math"))
			{
				totalPoints= totalPoints +  MathSubject(totalPoints);
			}
			else if ( subject.equalsIgnoreCase("Biology"))
			{

				totalPoints= totalPoints +  BiologySubject(totalPoints);
			}
			else if ( subject.equalsIgnoreCase("Technology"))
			{

				totalPoints=  totalPoints + TechnologySubject(totalPoints);

			
			grandTotal = grandTotal + totalPoints;}
			
			else 
				System.out.print("invalid answer haha");
			}
		}}
	} 


	// If the user pick the math subject, they are directed here

	public static int MathSubject(int totalPoints){
		//  Scanner
		Scanner myInput = new Scanner ( System.in);

		// Greeting
		System.out.println("Welcome to the math section of this QUIZ BOWL ! ");
		System.out.println("\n Let's Begin");

		// Declaring variables
		String [] mathQuestions = new String [10];
		String [] mathAnswers   = new String [10];
		String [] userAnswers   = new String [10];
		// math questions & answers 
		mathQuestions[0]= "\n Find the value of x \n 2x+ 5=11 ";
		mathAnswers[0]= "x=3";
		
		mathQuestions[1]= "\n What is the highest degree of a parabola?";
		mathAnswers[1]= "2";
		mathQuestions[2]= "\n Does the linear equation have a positive of negative slope : y=+2x=6 ?  ";
		mathAnswers[2]= "Positive" ;
		mathQuestions[3]= "\n Find the Answer; 34* 23 ";
		mathAnswers[3]= "782" ; 
		mathQuestions[4]= " \n What is the vertical asympotote of the expression y = 1/x ?";
		mathAnswers[4]= "Negative" ;
		mathQuestions[4]= " \n What is the answer of cos(90) ? ";
		mathAnswers[4]= "0" ; 
		mathQuestions[5]= "\n What is the vertex of the function y= -2 (x+6)^2 +9  ?";
		mathAnswers[5]= "-6,9" ; 
		mathQuestions[6]= " \n Find the answer : 67+7";
		mathAnswers[6]= "74" ;
		mathQuestions[7]= " \n  What is the period of a y= sin(x)";
		mathAnswers[7]= "2π" ; 
		mathQuestions[8]= " \n A hexagon has how many sides? ";
		mathAnswers[8]= "6" ; 
		mathQuestions[9]= " \n  Factor the following expression : 8 - 14y + 5y^2";
		mathAnswers[9]= "(4-5y)(2- y)" ;  


		for (int i = 0; i<=9; i++)
		{
			System.out.print ( mathQuestions[i] );



			userAnswers[i]= myInput.next();

			//Check if answer is correct

			if ( userAnswers[i].equalsIgnoreCase(mathAnswers[i]))

			{
				System.out.print("\n You are correct ! You get 10 points");

				// Add ten points 

				totalPoints = totalPoints + 10;    

			}

			else
				// if the answer is wrong
			{
				System.out.print("\n Sorry the answer was " +  mathAnswers[i] + " .");
				
				
			}

		}        

		// Return the value of points to main    
		return (totalPoints);

	}


	//If the user pick the biology subject, they are directed here
	public static int BiologySubject(int totalPoints)
	{

		//Scanner
		Scanner myInput = new Scanner ( System.in);

		// Greeting
		System.out.println("Welcome to the Biology section of this QUIZ BOWL ! ");
		System.out.println("Let's Begin");

		// declaring variables
		String [] biologyQuestions = new String [10];
		String [] biologyAnswers = new String [10];
		String [] userAnswers = new String [10];
		// Bio questions & answers
		biologyQuestions[0] =  "\n Lipase acts on which macronutrient ?"  
				; 
		biologyAnswers[0] =  "fats";
		biologyQuestions[1] =  "\n What is the valves that is present after the right atrium?";
		biologyAnswers[1] =  "tricuspid valve";
		biologyQuestions[2] =  "\n What is the name of the hormone that makes the pancrease produce sodium bicarbonate; a substance that neutralizes acidic chyme in the duodenum ?";
		biologyAnswers[2] =  "secretin";
		biologyQuestions[3] =  "\n Which vitamin helps maintain healthy gums ?";
		biologyAnswers[3] =  "Vitamin C";
		biologyQuestions[4] =  "\n Trypsin acts on which macronutrient ?";
		biologyAnswers[4] =  "Protein";  
		biologyQuestions[5] =  "\n What is the name of the chemical in the intestines that breaks dipeptides in to amino acids?";
		biologyAnswers[5] =  "peptidase";
		biologyQuestions[6] =  "\n How many bones are in the body? ";
		biologyAnswers[6] =  "206"; 
		biologyQuestions[7] =  "\n Do the pulumonary arteries carry deoxygentated of oxygentated blood?";
		biologyAnswers[7] =  "deoxygentated"; 
		biologyQuestions[8] =  "\n What is the valve the appears after the right ventricle? ";
		biologyAnswers[8] =  "Pulumonary Semi-Lunar Valve"; 
		biologyQuestions[9] =  "\n What does the gall bladder store? ";
		biologyAnswers[9] =  "bile"; 


		for (int i = 0; i<=9; i++)
		{
			System.out.print ( biologyQuestions[i] );



			userAnswers[i]= myInput.next();


			// if the answer is correct
			if ( userAnswers[i].equalsIgnoreCase(biologyAnswers[i]))

			{

				System.out.print("\n You are correct ! You get 10 points");

				// Add ten points

				totalPoints = totalPoints + 10;    

			}

			// if the answer is incorrect
			else

			{
				System.out.print("\n Sorry the answer was " +  biologyAnswers[i] + " .");
			}

		} 



		return (totalPoints);

	}

	// // If the user pick the TECHNOLOGY subject, they are directed here
	public static int TechnologySubject(int totalPoints)
	{


		//  Scanner
		Scanner myInput = new Scanner (System.in);


		// Greeting
		System.out.println("Welcome to the Technology section of this QUIZ BOWL ! ");
		System.out.println("Let's Begin");

		String [] technologyQuestions = new String [10];
		String [] technologyAnswers = new String [10]; 
		String [] userAnswers = new String [10];
		// tech questions and answers 
		technologyQuestions[0]= "\n A variable that store a true or false answe is known as a ";
		technologyAnswers[0]= "Boolean";
		technologyQuestions[1]= "\n A programming eror that violates the rules of java is known as a ? ";
		technologyAnswers[1]= "Logical Error";
		technologyQuestions[2]= "\n A variable made from a class is known as an ?";
		technologyAnswers[2]= "Object"; 
		technologyQuestions[3]= "\n A variable that can store a positive or negative whole number is known as a ?";
		technologyAnswers[3]= "integer";
		technologyQuestions[4]= "\n A variable made from aclass is known as an ?";
		technologyAnswers[4]= "Object?";
		technologyQuestions[5]= "\n Answer as true or false: A dynamic array can NOt shrink in size";
		technologyAnswers[5]= "False";
		technologyQuestions[6]= "\n Which type of repetition structures are most suitable for arrays?";
		technologyAnswers[6]= "For Loop";
		technologyQuestions[7]= "\n What is the equals symbol  that is used for if statements";
		technologyAnswers[7]= "==";
		technologyQuestions[8]= "\n Answer as true or false: A primitive data type can store more than one piece of information ";
		technologyAnswers[8]= "False";
		technologyQuestions[9]= "\n Answer as true or false: The variable name for a constant must be in lower case";
		technologyAnswers[9]= "False";




		for (int i = 0; i<=9; i++)
		{
			System.out.print ( technologyQuestions[i] );



			userAnswers[i]= myInput.next();

			//Checking if answer correct

			if ( userAnswers[i].equalsIgnoreCase(technologyAnswers[i]))

			{
				System.out.print("\n You are correct ! You get 10 points");


				// Add ten points 

				totalPoints = totalPoints + 10;    

			}
			// if the answer is incorrect
			else

			{
				System.out.print("\n Sorry the answer was " +  technologyAnswers[i] + " .");
			}

		} 


		return (totalPoints);

	}

}









