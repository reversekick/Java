/*
 * Copyright (c) 2017 Bitlrn Inc.
 * All rights reserved.
 */

package com.bitlrn.intro.sets;


import com.bitlrn.intro.interf.InterfaceSample;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetSample {

    private void sortKeySet(){
        HashMap props = new HashMap();

        props.put("key45", "some value");
        props.put("key12", "some other value");
        props.put("key39", "yet another value");
        Set s = props.keySet();
        s = new TreeSet(s);

        Iterator it = s.iterator();
        System.out.println("Displaying the order elements of Set due to usage of TreeSet");
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(new Integer(1));
        set.add(new Integer(3));
        set.add(new Integer(2));

        Iterator it = set.iterator();
        System.out.println("Displaying the order elements of Set due to usage of TreeSet");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
