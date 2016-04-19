import java.util.Random;
import java.util.Scanner;
import java.awt.Color;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import hsa_new.Console;

public class MurderHouse {

	public static void main(String[] args) {
		
		// Amina Ali & Ubah Ahmed
		// Murder house
		// April 19 2016
		
		hsa_new.Console c = new hsa_new.Console();
		
		Scanner scan = new Scanner(System.in);
	
// *** Variables 
		
		String answer1= " "; // Downstairs or call 911

		String answer2= " "; // go to the end of the hallway or don't

		String answer3= " "; // sneak attack or strike attack

		int answer4= 0; // which truck (1, 2 or 3)

	

		int tries=0;

		String answer8= " ";// Hide in closet or run to the neighbors

		int answer7=0; // which truck

		String answer9= " "; // Truck waiting outside

		String answer10= " "; // continue hiding or leave closet 

		String answer11= " "; // try to escape or shield yourself from axe

		String answer12= " ";// go back for revenge or run for safety

		String answer13= " "; // run outside / grab a knife or beg for your life

		String answer14= " "; //

		Random rand = new Random();

		int  randomNumber = rand.nextInt(50) + 1;




		c.println(

		"You are in your room watching netflix when you hear a  noise coming from  \n downstairs. \n  Do you either /A/ go downstairs \n or  /B/ hide in your closet and call 911"); // decision making



		answer1 = c.readLine();

		c.clear();



		if (answer1.equalsIgnoreCase("A")) // decision making 
			
        
		{

		c.println(

		"You go downstairs, and you hear a  noise in the hallway? What do you do? \n type  \n /A/ if you want to go to the end of the hall or type \n /B/ if you want to stay where you are"); //output

		answer2 = c.readLine();

		c.clear();



		if (answer2.equalsIgnoreCase("A"))// decision making

		{

		c.println(

		"You get to the kitchen down the hall, you hear the kidnapper coming close what do you do? \n type /A/ to hide & sneak attack or \n type /B/ to strike attack"); // decision making

		answer3 = c.readLine();

		c.clear();



		if (answer3.equalsIgnoreCase("A")) // you win     

		{

		c.println(

		"You sneak behind the murder and stab him in the leg. \n"
		+ " You then run for safety!  Congratulations! You are safe , you've won!");

		}


		
		else if (answer3.equalsIgnoreCase("B")) // you die    

		{
		
		c.println("The murderer attacks you first. He throws an axe in the middle of your chest. \n Your Dead"); // output


		}



		}



		else if (answer2.equalsIgnoreCase("B"))// decision making

		{



		c.println(

		"You stay where you are BUT the kidnapper comes behind you." // output

		+ " Type  /A/ to run outside?" // output

		+ "  /B/ try to grab a knife in the kitchen" // output

		+ " type /C/ to beg for your life"); // output

		answer3 = c.readLine();

		c.clear();



		if (answer3.equalsIgnoreCase("A"))

		// While loop

		{

		c.println(

		"You make it outside, & you see three trucks. \n  which one do you approach type /1/ , /3/  or /4/"); // output

		answer4 = Integer.parseInt(c.readLine());




		tries = 0;

		while (tries < 2) {



		if (answer4 != 3 && answer4 != 2 && tries != 2) {

		c.println("Sorry, theres no one in the truck. Try again!\n  Type another number /1/, /3/ or /4/"); // output

		answer4 = Integer.parseInt(c.readLine());



		}

		if (answer4 == 2) {

		c.println("That is not a valid number try again"); // output

		answer4 = Integer.parseInt(c.readLine());



		}



		else if (answer4 == 3) { // you die

		c.println("There are murderers in the truck, they kill you and your dead! \n Goodbye"); // output , you die

		tries = 4;



		}



		tries++;



		}

	

		if (tries == 2) {
		
		c.println("You have exceeded your tries. You die"); // output, you die
		}



		}



		else if (answer3.equalsIgnoreCase("B")) // try to grab a knife in

		// your kitchen

		{


		c.println(" You manage to grab the knife and kill the muderer! \n You have won and get to safety. Congrats!"); //output

		}



		else if (answer3.equalsIgnoreCase("C"))// beg for your life

		{

		c.println(" The murderer has no mercy and heartlessly kill you. \n You die. "); // output, you die

		}



		}

		}



		else if (answer1.equalsIgnoreCase("B")) // decision making 

		{ 

		           

		c.println(

		"The lines are all cut off, so you cannot call 911. You decide to hide in the closet, Suddenly you hear a noise downstairs. \n Do you either \n /A/ continue to hide in your closet \n or \n /B/ run to your "

		+ "neighbours house, \n  REMEMBER you only have a " + randomNumber

		+ " % chance of survival"); // output , you die

		answer8 = c.readLine();

		c.clear();


		if (answer8.equalsIgnoreCase("A")) 

		{

		c.println(" As you continue to stay in the closet \n you notice that the noise stops.\n Do you either /A/ continue to hide or /B/leave the closet");



		                answer10 = c.readLine();

		                c.clear();

		         

		                if (answer10.equalsIgnoreCase("A"))

		    {

		                c.println(" You stay in the closet but the murderer finds you. Your're dead!");

		    }

		               

		                else  if (answer10.equalsIgnoreCase("B"))

		    {

		                  c.println(" As you run away you slip on a rubber ducky \n and the murderer hears you fall He chases you around \n the house and he swings. Do you either \n /A/ try to escape"

		               	+"\n or /B/shield yourself from the axe");

		               	 

		                  answer11 = c.readLine();

		                  c.clear();

		 	               

		                if (answer11.equalsIgnoreCase("A"))

		                {

		 	           	c.println("You happen to make it out alive and run to saftey!Congrats you win!");

		                }

		                else if (answer11.equalsIgnoreCase("B"))

		              {

		 	           

		 	           	c.println("The murder chops off one of your arms and runs away.\n You are still alive do you either \n/A/  chase him to seek revenge or \n /B/ run for saftey");

		               

		              answer12 = c.readLine();



		                        if (answer12.equalsIgnoreCase("A"))

		                        {
 
		                        c.println("While your running you slip on a pool of your own blood.The murderer stands over you and watches you bleed out and die");

		                        }

		                        

		                        else if (answer12.equalsIgnoreCase("B"))

		                        {

		                        

		                        c.println("You go back for revenge but stop by the kitchen to retrieve a weapon.\n You strike at first sight, and kill the murderer.Congrats!");

		                        

		                        }

		 	           

		 	           

		              }  

		 	               

		 	               

		               	 

		    }

		      }

		else if (answer8.equalsIgnoreCase("B"))

		{

		c.println("You run outside and notice that you can run to 3 of your neighbours houses. \n type /1/ to go to Charlies house ,"

		+ " \n Type /3/ to go to  Mr.Browns house and \n Type /4/ to go to Zayn’s house.");


		answer7 = Integer.parseInt(c.readLine());

		c.clear();

		tries = 0;

		while (tries < 2) {



		if (answer4 != 3 && answer4 != 2 && tries != 2) {

		c.println("Sorry, theres no one at the house. Try again! Type another number /1/, /3/ or /4/");

		answer4 = Integer.parseInt(c.readLine());



		}

		if (answer4 == 2) {

		c.println("That is not a valid number try again");

		answer4 = Integer.parseInt(c.readLine());



		}



		else if (answer4 == 3) { 

		tries=4; 

		}



		tries++;



		}



		if (tries == 2) {

		c.println("You have exceeded your tries. You die");

		}

		if(tries==5)

		{



		c.println("You see a mysterious truck waiting outside."

		+ " \n Type /A/ to either continue making your way to Mr. Browns house or"

		+ "\n  type /B/ to detour andmake your way to the truck");

		answer9 = c.readLine();

		c.clear();

		if (answer9.equalsIgnoreCase("A")) {

		c.println("You continue to make your way to the house, when the truck starts following you. "

		+ "A man shoots his gun at you from his truck. You died");



		}


		else if (answer9.equalsIgnoreCase("B")){
			 				
		                         c.println("You make your way to the truck,\n but the people in there"

		                         + " are also murderes. They stab you 21 times. \nYou die brutally"); 

		                         

		}



		}



		}










		}






		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


