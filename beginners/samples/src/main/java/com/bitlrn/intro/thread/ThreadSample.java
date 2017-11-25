/*
 * Copyright (c) 2017 Bitlrn Inc.
 * All rights reserved.
 */

package com.bitlrn.intro.thread;
import com.bitlrn.intro.dowhile.DoWhileSample;


public class ThreadSample {
    public static void main(String[] args) {
        DoWhileSample dws = new DoWhileSample();
        FirstThread ft = new FirstThread();
        Thread thread = new Thread(ft);
        thread.start();

        System.out.println("Odd and Even:");
        dws.printEvenOddNumbers(20,false);
    }
}

class FirstThread implements Runnable{
    public void run() {
        DoWhileSample dws = new DoWhileSample();
        dws.multiples(5,20);
    }
}
