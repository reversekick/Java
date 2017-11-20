package com.bitlrn.intro.ifelse;

import java.util.Scanner;

public class IfElseSample {
    /**
     * canVote utilizes if-else condition in java
     * to determine vote eligibility
     * @param age -age input
     * @return true if can vote else false
     */
    public boolean canVote(int age){
        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }

    /**
     * For input number "num" determins if its even or odd
     * using if-else condition in java
     * @param num
     * @return true if even else false
     */
    public boolean isEven(int num){
        /*
          Even number when divided by 2 have remainder 0
         */
        if(num%2 ==0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Determine vote eligibility based on age input
     * <note>
     * The other approach of conidtion statement is
     * the ternary statement.
     * Where in you put the boolean check, followed by "?"
     *    - the first statement indicates what is returned if boolean check is true
     *    - the second statement after ":" indicates the return value if boolean check is false
     * As its not read-able this statement is discouraged in usage
     * </note>
     *
     * @param age
     * @return  String "Yes" if eligible
     */

    public String voteEligibility(int age){
        return canVote(age) ? "Yes" : "No";
    }
    /**
     * Compares two numbers, the return value indicates
     *       if they are equal or first number is largest
     *          or first number is smallest
     * @param num1  - first number
     * @param num2 - second number
     * @return return >0 if num1 is greater than num2
     *         return <0 if num1 is smaller than num2
     *         return 0 if num 1 is equal to num2
     */
    public int compareNumber(int num1, int num2) {
        return num1-num2;
    }

    /**
     * Prints the comparision of two numbers
     * Shows usage of multiple if-else statements
     * @param num1 - first number
     * @param num2 - second number
     */
    public void printLargestNumber(int num1, int num2){
        if(compareNumber(num1,num2) > 0){
            System.out.println(num1 +" is larger than "+ num2);
        }else if (compareNumber(num1,num2) < 0){
            System.out.println(num1 +" is smaller than "+ num2);
        }else{
            System.out.println(num1 +" is equal to "+ num2);
        }
    }

    /**
     * Checks if number is positive or negative or 0
     * @param num
     * @return 1 - if positive,
     *         -1- if negative
     *         0 - if zero
     */
    public int checkPositiveNegativeZero(int num) {
        if(num>0){
            return 1;
        }else if(num < 0){
            return -1;
        }else{
            return 0;
        }
    }

    public static void main(String args[]){
        IfElseSample ies = new IfElseSample();
        Scanner scanner = new Scanner(System.in);

        //vote eligibility
        System.out.println(" Enter your age to check vote elgibility = ");
        int input = scanner.nextInt();
        System.out.println("Your vote eligibility:"+ies.voteEligibility(input));
        System.out.println("Your vote eligibility if 17 years old is :"+ies.voteEligibility(17));

        //odd even number check
        System.out.println("Enter number you want to check as odd or even =");
        input = scanner.nextInt();
        System.out.println(input + " is "+ (ies.isEven(input)?"even":"odd"));

        //comparing of two numbers - printing largest
        System.out.println("Enter two numbers to compare, first number = ");
        int num1 = scanner.nextInt();
        System.out.println(" enter second number =");
        int num2 = scanner.nextInt();
        ies.printLargestNumber(num1,num2);

        //Checks if number is positive or negative or zero
        System.out.println("Enter number you want to check = ");
        input = scanner.nextInt();
        System.out.println("Number is positive(Output=1) or negative(Output=-1) or equal to zero(Output =0):"
                            +ies.checkPositiveNegativeZero(input));
    }
}
