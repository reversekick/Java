/*
 * Copyright (c) 2017 Bitlrn Inc.
 * All rights reserved.
 */

package com.bitlrn.intro.wrapper;

/**
 * Java has Wrapper Classes for the primitive data types
 * so that you can use the object of these classes while working
 * with collections e.g. Integer is for int base type,
 * Double is for double type .. so on.
 *
 * Boxing and Unboxing means wrapping a base type like int using
 * Wrapper class Integer(boxing) and when doing operations the actual
 * value of the base type is retrieved (Unboxing)
 *
 *
 *
 */
public class WrapperSample {
    public static void main(String[] args) {
        System.out.println(" Using various wrapper classes and printing their values");
        Integer in = new Integer(Integer.MAX_VALUE);
        Float fl = new Float(Float.MAX_VALUE);
        Double dbl = new Double(Double.MAX_VALUE);
        Long lg = new Long(Long.MAX_VALUE);
        Character c = new Character (Character.MAX_VALUE);
        Byte byt = new Byte(Byte.MAX_VALUE);
        Boolean bool = new Boolean(true);

        System.out.println("Integer wrapper with value"+ in);
        System.out.println("Float wrapper with value"+ fl);
        System.out.println("Integer wrapper with value"+ dbl);
        System.out.println("Long wrapper with value"+ lg);
        System.out.println("Character wrapper with value"+ c);
        System.out.println("Boolean wrapper with value"+bool);
        System.out.println("Byte wrapper with value"+byt);


    }
}
