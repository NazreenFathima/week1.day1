package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		int range = 8, firstNum = 0, secNum = 1, sum;
		// Print first number
		System.out.println("The first number is "+firstNum);
		// Iterate from 1 to the range
		for (int i = 1; i < range; i++) 
		{
		// add first and second number assign to sum
		sum = firstNum + secNum;
		// Assign second number to the first number
		firstNum = secNum;
		// Assign sum to the second number
		secNum = sum;	
		// print sum
		System.out.print(" " + sum);
		}

	}

}
