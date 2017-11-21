package com.bitlrn.intro.overloading;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionOverloadSampleTest {
    private FunctionOverloadSample fos = null;
    @Before
    public void setUp() throws Exception {
        fos = new FunctionOverloadSample();
    }

    @Test
    public void cube() throws Exception {
        Assert.assertEquals(27,fos.cube(3));

    }

    @Test
    public void cube1() throws Exception {
        Assert.assertEquals(27.0, fos.cube(3.0),0.0);
    }
}