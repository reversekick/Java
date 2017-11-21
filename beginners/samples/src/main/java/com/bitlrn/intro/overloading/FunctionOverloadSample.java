package com.bitlrn.intro.overloading;

import java.util.Scanner;


public class FunctionOverloadSample {
    public int cube(int x){
        return x * x * x;
    }
    public double cube(double x){
        return x * x * x;
    }
    public static void main (String[] args){
        FunctionOverloadSample fos = new FunctionOverloadSample();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number whose cube needs to be found = ");
        int input = scanner.nextInt();
        System.out.println("Cube = "+fos.cube(input));

        System.out.println("Enter the number whose cube needs to be found (enter as double)= ");
        double x = scanner.nextDouble();
        System.out.println("Cube ="+fos.cube(x));


    }
}
