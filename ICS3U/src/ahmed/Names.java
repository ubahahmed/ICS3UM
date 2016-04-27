package ahmed;

import java.util.Scanner;

public class Names {
	
	
	public static void main(String[] args) {
		//input
				Scanner scan = new Scanner (System.in);
				System.out.println("How many names do you want to input ?");
				
				//arrays
				int numNames = Integer.parseInt(scan.nextLine());
				
				String [] names = new String [numNames];
				
				//output
				System.out.println("Enter the names you want to input in order");
				for (int i=0; i<numNames; i++)
				{
					names[i] = scan.nextLine();
				}
				
				System.out.println("These are the names you entered");
				for (int i=0; i<numNames; i++)
				{
					System.out.println(names[i]);
				}

				System.out.println("Now the names from last to first");
				for (int i=numNames-1; i>=0; i-- )
				{
					System.out.println(names[i]);
				}
	}
		

		
		
		
		
		
		
		
	}

}
