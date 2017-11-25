/*
 * Copyright (c) 2017 Bitlrn Inc.
 * All rights reserved.
 */

package com.bitlrn.intro.collection;


import java.util.ArrayList;
import java.util.List;

public class CollectionSample {
    private List<Integer> numbers = new ArrayList<Integer>();
    public List<Integer> addToArrayList(int noOfNumbers){
        for(int i = 1; i<=noOfNumbers;++i){
            numbers.add(new Integer(i));
        }
        return numbers;
    }

    public void displayArrayList(){
        System.out.println("Printing the array list");
        for(Integer i: numbers){
            System.out.println(i);
        }
    }
}
