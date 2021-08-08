package week1.day1;

public class ArmstrongNumner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare your input
		int input = 370;
		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
		int calculated = 0, remainder, original;
		// Assign input into variable original 
		original = input;
		// Use loop to calculate: use while loop to set condition until the number greater than 0
		while (input > 0)
		{
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			remainder = input%10;
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
			input = input/10;
			// Within loop: Add calculated with the cube of remainder & assign it to calculated
			calculated += Math.pow(remainder, 3);
		}
		
	// Check whether calculated and original are same
	if (calculated == original)
	{
		//When it matches print it as Armstrong number
		System.out.println("The Input Number is Armstrong");
	}
	}
}


