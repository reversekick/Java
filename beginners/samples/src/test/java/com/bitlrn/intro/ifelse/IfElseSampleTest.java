package com.bitlrn.intro.ifelse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IfElseSampleTest {
    private IfElseSample ies  = null;
    @Before
    public void setUp() throws Exception {
        ies = new IfElseSample();
    }

    @Test
    public void canVote() throws Exception {
        Assert.assertEquals(true,ies.canVote(18));
        Assert.assertEquals(false,ies.canVote(15));
    }

    @Test
    public void isEven() throws Exception {
        Assert.assertEquals(true,ies.isEven(2));
        Assert.assertEquals( false,ies.isEven(1));
    }

    @Test
    public void voteEligibility() throws Exception {
        Assert.assertEquals(ies.voteEligibility(18),"Yes");
        Assert.assertEquals(ies.voteEligibility(15),"No");
    }

    @Test
    public void largestNumber() throws Exception {
        Assert.assertEquals(ies.compareNumber(18,19),-1);
        Assert.assertEquals(ies.compareNumber(19,18),1);
        Assert.assertEquals(ies.compareNumber(0,-1),1);
        Assert.assertEquals(ies.compareNumber(5,1),4);
        Assert.assertEquals(ies.compareNumber(-2,-2),0);
    }

    @Test
    public void checkPositiveNegativeZero() throws Exception {
        Assert.assertEquals(ies.checkPositiveNegativeZero(5),1);
        Assert.assertEquals(ies.checkPositiveNegativeZero(-1),-1);
        Assert.assertEquals(ies.checkPositiveNegativeZero(0),0);
    }

}