package com.bitlrn.intro.dowhile;

import java.util.Scanner;

public class DoWhileSample {
	/**
	 * Finds the sum of digits of a number
	 *   -- Note: if input number is negative still it picks the digits as positive and adds them
	 * @param num - input
	 * @return sum of the digits.
	 */
	public int addDigitsOfNumber(final int num){
		int rem;
		int sum=0;
		int partial;

		partial = num;
		if(partial < 0){
			partial *= -1;
		}
		do
		{
			rem = partial % 10;
			sum = sum + rem;
			partial = partial / 10;
		}while (partial > 0);
		return sum;
	}

	/**
	 * Prints the old and even numbers upto maxOfSequence number.
	 * Return the odd sequence found or even found based on returnOdd value.
	 * @param maxOfSequence -- The numbers upto this number is printed
	 * @param returnOdd  -- if true returns odd numbers else even numbers;
	 * @return array of odd Or even numbers based on returnOdd flag.
	 */
	public int[] printEvenOddNumbers(int maxOfSequence,boolean returnOdd){
		int i=1;
		int result[] =new int[maxOfSequence/2];
		int index=0;
		do
		{
			if(i%2==0) {
				System.out.println("Number " + i + " is Even");
				if(!returnOdd){
					result[index++]=i;
				}
			}else{
				if(returnOdd){
					result[index++]=i;
				}
				System.out.println("Number " + i + " is Odd");
			}
		}while ( ++i <= maxOfSequence);
		return result;
	}

	/**
	 * Prints factorial of a given number
	 * @param num
	 * @return factorial result.
	 */
	public int factorial(int num){
		int i = 1;
		int fact =1;
		do{
			fact = fact* i;
		}while (++i <= num );
		return fact;
	}


	/**
	 * Takes a number to indicate how many
	 * Fibonacci numbers should be printed.
	 * @param firstN
	 * @return Array of Fibonacci sequences
	 *
	 * example:
	 * sequence : 5
	 * it will print 0 1 1 2 3 .
	 *
	 */

	public int[] fibonacci(int firstN){
		int result [] = new int[firstN];
		int i=1;
		System.out.println("Fibnocaci series:");
		result[0]=0;
		result[1]=1;
		System.out.print( " "+result[0]);
		System.out.print( " "+ result[1]);
		do{
			result[i+1] = result[i-1] + result[i];
			System.out.print(" "+result[i+1]);
		}while( ++i < firstN -1);
		System.out.println("");
		return result;
	}

	/**
	 * Prints the reverse string of a number
	 * @param numToReverse
	 * @return int - the reversed number
	 * example:
	 * numToReverse = 4321
	 * After reversed it will be 1234
	 */
	public int reverseDigits(int numToReverse){
		int remainingNum = numToReverse;
		int reversedNumber = 0;
		do{
			 reversedNumber = reversedNumber * 10 + remainingNum%10;
		}while((remainingNum =remainingNum/10) >0);
		return reversedNumber;
	}

	public int[] multiples(int num) {
		int result[] = new int[10];
		int i =1;
		do {
			result[i-1] =num*i;
			System.out.println(num + " * "+ i + " = "+result[i-1]);
		} while(++i <= 10);
		return result;
	}

	public static void main(String[] args) {
		DoWhileSample sample = new DoWhileSample();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number whose digits needs to be added = ");
		int x = sc.nextInt();

		System.out.println("Added digits of a number is "+sample.addDigitsOfNumber(x));

		System.out.println("Print the sequence of odd and even numbers uptill this number =");
		x = sc.nextInt();
		sample.printEvenOddNumbers(x,false);

		System.out.println("Find Factorial of  =");
		x = sc.nextInt();

		System.out.println("Factorial of "+ x + " is "+sample.factorial(x));

		System.out.println("Print Fibonacci series for =");
		x = sc.nextInt() ;
		sample.fibonacci(x);

		System.out.println("Enter number that needs to be reversed =");
		x = sc.nextInt();
		System.out.print("Reverse of "+ x + " is "+sample.reverseDigits(x));

		System.out.println("Find multiples of this number = ");
		x = sc.nextInt();

		sample.multiples(x);

	}
}
