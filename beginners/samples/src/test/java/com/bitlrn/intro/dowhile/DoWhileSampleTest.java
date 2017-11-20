package com.bitlrn.intro.dowhile;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoWhileSampleTest {
    DoWhileSample dws = null;
    @Before
    public void setUp() throws Exception {
         dws =new DoWhileSample();
    }

    @Test
    public void reverseDigits() throws Exception {
        Assert.assertEquals(1234,dws.reverseDigits(4321));
    }

    @Test
    public void reverseDigits_negative_0() throws Exception {
        Assert.assertEquals(0,dws.reverseDigits(0));
    }

    @Test
    public void reverseDigits_boundary_0() throws Exception {
        Assert.assertEquals(1,dws.reverseDigits(1));
    }

    @Test
    public void reverseDigits_boundary_large() throws Exception {
        Assert.assertEquals(000000001,dws.reverseDigits(10000000));
    }

    @Test
    public void fibonacci() throws Exception {
        int resultFib[]= {0, 1,1,2,3};
        Assert.assertArrayEquals(resultFib,dws.fibonacci(5));
    }
    @Test
    public void factorial() throws Exception {
        Assert.assertEquals(24,dws.factorial(4));
        Assert.assertEquals(1,dws.factorial(0));
    }

    @Test
    public void printEvenOddNumbers() throws Exception {
        int even[] = {2,4,6,8,10,12,14,16,18,20};
        int odd[] = {1,3,5,7,9,11,13,15,17,19};
        Assert.assertArrayEquals(even,dws.printEvenOddNumbers(20,false));
        Assert.assertArrayEquals(odd,dws.printEvenOddNumbers(20,true));
    }
    @org.junit.Test
    public void addDigitsOfNumber() throws Exception {
        Assert.assertEquals(18,dws.addDigitsOfNumber(909));
    }
    @org.junit.Test
    public void addDigitsOfNegativeNumber() throws Exception {
        Assert.assertEquals(10,dws.addDigitsOfNumber(-505));
    }

    @Test
    public void multiples(){
        int result[] = {5,10,15,20,25,30,35,40,45,50};
        Assert.assertArrayEquals(result,dws.multiples(5));
    }


}