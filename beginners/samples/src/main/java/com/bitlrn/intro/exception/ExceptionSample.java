/*
 * Copyright (c) 2017 Bitlrn Inc.
 * All rights reserved.
 */

package com.bitlrn.intro.exception;


import java.util.Scanner;

public class ExceptionSample {
    public void divideByZero(int a , int b) throws ArithmeticException{
        System.out.println (" a = "+ a + " b= "+ b);
        System.out.println("a/b="+ a/b);
    }
    public void arrayBoundsException(){
        int[] i = new int[]{1,2,3};
        System.out.println(i[4]);
    }
    public static void main(String[] args) {
        ExceptionSample es = new ExceptionSample();
        Scanner scanner = new Scanner(System.in);
        System.out.println("To try exception enter a number to be divide by 0");
        int num = scanner.nextInt();

        try{
            es.divideByZero(num,0);
        }catch (ArithmeticException ae){
            System.out.println(" Reason of exception "+ ae);
        }

        try{
            es.arrayBoundsException();
        }catch(ArrayIndexOutOfBoundsException aio){
            System.out.println("Reason of exception "+ aio);
        }
    }
}
