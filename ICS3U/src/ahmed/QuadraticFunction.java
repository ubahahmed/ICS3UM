package ahmed;
import java.text.DecimalFormat;
import java.util.Scanner;


public class QuadraticFunction {

	
	public static void main(String[] args) {
	
	
	
	
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int c; 
		double x1; 
		double x2;
		
		DecimalFormat df= new DecimalFormat("0.00");
		System.out.println("Please enter the value of a");
		a = Integer.parseInt(scan.nextLine()); 
		System.out.println("Please enter the value of b");
		b = Integer.parseInt(scan.nextLine()); 
		System.out.println("Please enter the value of c");
		c = Integer.parseInt(scan.nextLine()); 
		
	x1 = (-b + (Math.sqrt(Math.pow(b,2)) - 4 * a * c ))/(2*a);
	x2 = (-b - (Math.sqrt(Math.pow(b,2)) - 4 * a * c ))/(2*a);
	
	
	if (Math.pow(b, 2)- 4*a*c <0 )
	{
		System.out.println(" There are no real roots " );
	}
	else if  (Math.pow(b, 2)- 4*a*c == 0 )
	{
		System.out.println(" There is one real roots " + df.format(x1));
	}
	else 
	{
		System.out.println(" There are 2 real roots" + df.format(x2) +  df.format(x1));
	}
		
		
	}
	
}
	


