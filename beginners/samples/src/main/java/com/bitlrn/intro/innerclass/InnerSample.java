/*
 * Copyright (c) 2017 Bitlrn Inc.
 * All rights reserved.
 */

package com.bitlrn.intro.innerclass;

public class InnerSample {

    public static void main(String args[]) {
        Outer or = new Outer();
        Outer.Inner ir = or.new Inner();
        ir.display();
    }

}

class Outer {
    int x = 100;

    class Inner {
        int y = 200;

        void display() {
            System.out.println(x * y);
        }
    }
}
