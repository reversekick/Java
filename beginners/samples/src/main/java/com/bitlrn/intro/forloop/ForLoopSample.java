/*
 * Copyright (c) 2017 Bitlrn Inc.
 * All rights reserved.
 */

package com.bitlrn.intro.forloop;

import java.util.Scanner;

public class ForLoopSample {
    public int addDigitOfNumbers(int num ){
        int sum =0;
        int input = num;
        if(input <0){
            input = input * -1;
        }
        for(int i =input ; i > 0 ; i=i/10){
            sum += i%10;
        }
        return sum;
    }
    /**
     * Prints the even and odd numbers upto maxNumSequence
     *  returns odd if returnOdd is true else returns even numbers
     * @param maxNumSequence - print odd/even upto this maxNumSequence
     * @param returnOdd true to return odd else return even
     * @return odd or even numbers based on flag returnOdd
     */
    public int[] printEvenAndOdd(int maxNumSequence, boolean returnOdd) {
        int result[] = new int[maxNumSequence/2];
        int j=0;
        for(int i=1; i <= maxNumSequence; ++i){
            if(i%2 == 0){
                System.out.println(i + " is even");
                if(!returnOdd){
                    result[j++]=i;
                }
            }else {
                System.out.println(i + " is odd");
                if (returnOdd) {
                    result[j++] = i;
                }
            }
        }

        return result;
    }

    /**
     * Find the factorial of a given number
     * @param num
     * @return
     */
    public int factorial(int num){
        int fact =1;
        for(int i=1; i <=num;i++){
            fact = fact * i;
        }
        System.out.println("Factorial of "+num + " is "+fact);
        return fact;
    }

    /**
     * Prints the first "num" specified fibonacci series
     * @param num - series upto
     * @return fibonacci series computed
     */

    public int[] fibonacci(int num) {
        int result[] = new int[num];
        result[1]=1;
        System.out.println("\nFibonacci series of first "+ num + " is:");
        System.out.print(" "+result[0] + " "+ result[1]);
        for(int i=1; i<num-1;i++){
           result[i+1]= result[i-1] + result[i];
           System.out.print( " "+result[i+1]);
        }
        return result;
    }

    /**
     * Given a number returns number with after reversing digits
     * @param num
     * @return reverse digits of num
     */
    public int reverseNumber(int num){
        int result = 0;
        for(int i=num; i > 0; i=i/10) {
            result = result * 10 + i % 10;
        }
        System.out.println("Reverse of "+ num + " is "+ result);
        return result;
    }

    /**
     * Finds the first 10 multiples of given number
     * @param num - number whose multiples needs to be found
     * @return Array containing the multiples
     */
    public int[] multiples(int num){
        int result[] = new int[10];
        for(int i=1; i<=10;++i ){
            result[i-1] = i * num;
            System.out.println(num + "*" + i + " = "+ result[i-1]);
        }
        return result;
    }

    public static void main(String[] args) {
        ForLoopSample sample = new ForLoopSample();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number whose digits needs to be added = ");
        int x = sc.nextInt();

        System.out.println("Added digits of a number is "+sample.addDigitOfNumbers(x));

        System.out.println("Print the sequence of odd and even numbers uptill this number =");
        x = sc.nextInt();
        sample.printEvenAndOdd(x,false);

        System.out.println("Find Factorial of  =");
        x = sc.nextInt();

        System.out.println("Factorial of "+ x + " is "+sample.factorial(x));

        System.out.println("Print Fibonacci series for =");
        x = sc.nextInt() ;
        sample.fibonacci(x);

        System.out.println("Enter number that needs to be reversed =");
        x = sc.nextInt();
        System.out.print("Reverse of "+ x + " is "+sample.reverseNumber(x));

        System.out.println("Find multiples of this number = ");
        x = sc.nextInt();

        sample.multiples(x);

    }

}
