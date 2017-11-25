
/*
 * Copyright (c) 2017 Bitlrn Inc.
 * All rights reserved.
 */

package com.bitlrn.intro.string;

public class StringSample {
    private void concatenate(){
        String str = "Hello";
        String str2 = "Hello";

        System.out.println("Are the two string objects pointing to same string?(true/false)" + (str==str2));

        str2 = str + "World";
        System.out.println("String str value is "+ str);
        System.out.println("String str2 value is "+str2);

        System.out.println("Are the two string objects pointing to same location still?(true/false)"+(str==str2));

    }

    private void proveStringImmutableOnHeap(){
        /*
            String literal are allocated in string pool and same literal when found then
            there is no allocation separate allocation when second string is assigned
            same literal.
         */

        String str = "Hello";
        String str2 = "Hello";

        System.out.println("Hashcode of the first string "+System.identityHashCode(str));
        System.out.println("Hashcode of the second string "+System.identityHashCode(str2));

        System.out.println("Are the two string objects pointing to same string?(true/false)" + (str==str2));

        //After concatenating with "world" when you print the Hashcode of the str --
        // it will be different than the earlier one - proving that String are immutable
        str = str + "world";
        System.out.println("Hashcode of the first string "+System.identityHashCode(str.hashCode()));
        System.out.println("Hashcode of the second string "+ System.identityHashCode(str2.hashCode()));


        // here we are allocating string on heap.
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        //the Hashcodees would be different
        System.out.println("Hashcode of the third string "+System.identityHashCode(str3));
        System.out.println("Hashcode of the fourth string "+System.identityHashCode(str4));

        System.out.println("Are the two string objects pointing to same string?(true/false)" + (str3==str4));

        str3 = str3 + "World";

        System.out.println("Hashcode of the third string"+System.identityHashCode(str3));
        System.out.println("Hashcode of the fourth string"+ System.identityHashCode(str4));




    }
    public static void main(String[] args) {
        StringSample ss = new StringSample();
        /*
         The following literal string is allocated on String Pool area in heap
         where in it utilizes the same string when assigned to second
        */
        String first = "hello";
        String second = "hello";

        //compare address or identity of the string
        System.out.println("first string and second string identities are the same? (true/false)"+(first==second));


        /*
         The following two strings are allocated on heap and will have different locations in heap memory
         */
        String third = new String("hello");
        String fourth = new String("hello");


        System.out.println("third string and fourth string identities are the same?(true/false)"+(third==fourth));

        //concatenate sample
        ss.concatenate();

        ss.proveStringImmutableOnHeap();
    }


}
