/*
 * Copyright (c) 2017 Bitlrn Inc.
 * All rights reserved.
 */
package com.bitlrn.intro.packg;

import com.bitlrn.intro.dowhile.DoWhileSample;

/**
 * The purpose of thie program is to show the
 * usage of another package class in this different package
 * class
 */
public class PackageSample {
    public static void main(String[] args) {
        DoWhileSample dws = new DoWhileSample();
        System.out.println("Sum of digits 23 is:");
        System.out.println(dws.addDigitsOfNumber(23));
        System.out.println("Factorial of 3  is "+ dws.factorial(3));
        System.out.println("Fibonacci series of number 4:");
        dws.fibonacci(4);
        System.out.println("Reverse of 4567 "+dws.reverseDigits(4567));
    }
}
