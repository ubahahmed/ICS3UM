
public class IsPrime {


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	int userNum; 
	System.out.println("Please enter your number.");
	userNum = Integer.parseInt(scan.nextLine()); 

	if(isPrime(userNum) == true)
	{
	System.out.println("It is not a prime number");
	}
	else if (isPrime(userNum) == false)
	{
	System.out.println("It is a prime number");
	}


	}
	public static boolean isDivisible(int userNum, int y)
	{
	/**
	*This method finds out if the number is prime or not
	**/
	if (userNum % y == 0)
	{

	return true; // not a prime number
	}

	return false; //prime number
	}
	public static boolean isPrime(int userNum)
	{
	/**
	*This method gets the result and tells if it's prime or not
	**/
	if (userNum ==1 || userNum ==0 || userNum == -1)
	{
	return true;
	}
	for (int i = 2; i < userNum; i++)
	{
	if(isDivisible(userNum, i) == true)
	{
	return true;


	}

	}


	return false;}}


	