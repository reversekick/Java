/*
 * Copyright (c) 2017 Cisco Systems, Inc.
 * All rights reserved.
 */

package com.bitlrn.intro.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySampleTest {
    private ArraySample as = null;
    @Before
    public void setUp() throws Exception {
        as = new ArraySample();
    }

    @Test
    public void initArray() throws Exception {
        Assert.assertArrayEquals(new int[]{0,1,2,3,4,5,6,7,8,9},as.initArray(10));
        Assert.assertArrayEquals(new int[]{0}, as.initArray(1));
    }

}