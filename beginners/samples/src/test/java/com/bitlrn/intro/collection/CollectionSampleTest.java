/*
 * Copyright (c) 2017 Cisco Systems, Inc.
 * All rights reserved.
 */

package com.bitlrn.intro.collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by syedbahm on 11/24/17.
 */
public class CollectionSampleTest {
    CollectionSample cs = null;
    @Before
    public void setUp() throws Exception {
        cs = new CollectionSample();
    }

    @Test
    public void addToArrayList() throws Exception {
        int[] a = new int[]{1,2,3,4,5,6,7};
        Integer [] actual = (Integer[])cs.addToArrayList(7).toArray(new Integer[0]);
        for(int i=0; i < a.length;++i){
            assertEquals((int)actual[i],a[i]);
        }

    }

}