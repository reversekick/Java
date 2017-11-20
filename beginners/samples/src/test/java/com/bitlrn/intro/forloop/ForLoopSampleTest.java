package com.bitlrn.intro.forloop;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ForLoopSampleTest {
    private ForLoopSample fls = null;
    @Before
    public void setUp() throws Exception {
        fls = new ForLoopSample();
    }

    @Test
    public void addDigitOfNumbers() throws Exception {
        Assert.assertEquals(10,fls.addDigitOfNumbers(4321));

        //boundary and negative condition
        Assert.assertEquals(0,fls.addDigitOfNumbers(0));

        Assert.assertEquals(10,fls.addDigitOfNumbers(-4321));
    }

    @Test
    public void printEvenAndOdd() throws Exception {
        int resultEven[] = {2,4,6,8,10};
        int resultOdd[] = {1,3,5,7,9};

        Assert.assertArrayEquals(resultEven,fls.printEvenAndOdd(10,false));
        Assert.assertArrayEquals(resultOdd,fls.printEvenAndOdd(10,true));

    }

    @Test
    public void factorial() throws Exception {
        Assert.assertEquals(120,fls.factorial(5));
        Assert.assertEquals(1,fls.factorial(0));
        Assert.assertEquals(1,fls.factorial(1));

    }

    @Test
    public void fibonacci() throws Exception {
        int fib5[] = {0,1,1,2,3};
        int fib3[] = {0,1,1};
        Assert.assertArrayEquals(fib5,fls.fibonacci(5));
        Assert.assertArrayEquals(fib3,fls.fibonacci(3));

    }

    @Test
    public void reverseNumber() throws Exception {
        Assert.assertEquals(4567,fls.reverseNumber(7654));
        Assert.assertEquals(0,fls.reverseNumber(0));
        Assert.assertEquals(1,fls.reverseNumber(1));
    }

    @Test
    public void multiple() throws Exception {
        int multiple5[] = {5,10,15,20,25,30,35,40,45,50};
        int multiple0[] = {0,0,0,0,0,0,0,0,0,0};
        int multiple1[] = {1,2,3,4,5,6,7,8,9,10};
        Assert.assertArrayEquals(multiple5,fls.multiples(5));
        Assert.assertArrayEquals(multiple0,fls.multiples(0));
        Assert.assertArrayEquals(multiple1,fls.multiples(1));
    }

}