package ahmed;

import java.util.Scanner;

public class wordGuess {

	public static void main(String[] args) {
		// Ahmed Ubah
		// Word guess
		// April 9 2016
		
		// variables and my arrays
		String[] secretWord = new String[] { "red", "orange", "yellow", "green", "blue", "violet", "white", "black", "pink", "brown", "gold",  "silver", "magenta", "coral", "peach", "aqua", "Beige","bronze", "burgandy", "carmel"}; 
		int random;
		Scanner scan = new Scanner(System.in);
		String letterGuess = null;
		String wordGuess;
		int  num;
		boolean fullWord = false;
		 
		//gets the word
		random = (int) (Math.random() * secretWord.length);
		String word = "";
		 
		for (int i = 0; i < secretWord[random].length(); i++) {
		word = word + "-";
		}
		System.out.println("Welcome lets play hangman");
		System.out.println("Rules are simple: you guess a letter each time, and if you know the colour just enter '!'");
		System.out.println(word);
		 
		do{
		if (word.equals(secretWord[random])){
		fullWord = true;
		}else{
		System.out.println("Guess a letter");
		letterGuess = scan.nextLine();
		if (letterGuess.equals("!")){
		fullWord = true;
		}
		else{
		 
		num = secretWord[random].indexOf(letterGuess);
		if (num== -1){
		System.out.println("that word isnt in there");
		}
		else{
		word = word.substring(0, num) + letterGuess + word.substring ((num+1), word.length()); 
		 
		System.out.println(word);
		}
		}
		}
		} while (!fullWord);
		if (letterGuess.equals("!")){
		System.out.println("Enter the whole word now");
		wordGuess = scan.nextLine();
		if (wordGuess.equalsIgnoreCase(secretWord[random])){
		System.out.println("You guessed the word, Congratulations you won!");
		}
		else {
		System.out.println("you only had one chance to guess the word and you got it wrong so you lost.");
		}
		}
		else {
		System.out.println("You guessed the word, congragulations you won!");
		}
		 
		 
		 
		}
		
		
	}


