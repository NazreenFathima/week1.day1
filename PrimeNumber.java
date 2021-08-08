package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare an int Input and assign a value 13
		int input = 13;
		// Declare a boolean variable flag as false
		boolean flag = false;		
		// Iterate from 2 to half of the input
		for (int i = 2; i <= (input / 2); i++)
		{
			// Divide the input with each for loop variable and check the remainder
			// Set the flag as true when there is no remainder
			// break the iterator
			if (input % i == 0)
			{
				flag = true;
				break;
			}
		}
		// Check the flag (Provide a condition)
		if (flag == false)
			// Print 'Prime' when the condition matches
			System.out.println("The Number is Prime");

		else
			// Print 'Not a Prime' when the condition doesn't match 
			System.out.println("The Number is Non-Prime");
		}
}
				

					

					

					


				

				

					

	
	


