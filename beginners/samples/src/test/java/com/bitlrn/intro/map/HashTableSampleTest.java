/*
 * Copyright (c) 2017 Cisco Systems, Inc.
 * All rights reserved.
 */

package com.bitlrn.intro.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class HashTableSampleTest {
    HashTableSample hts = null;
    @Before
    public void setUp() throws Exception {
        hts = new HashTableSample();
    }

    @Test
    public void addStudent()throws Exception{
        HashTableSample.Student student = hts.addStudent(1234,"Stud1",3.5 );
        assertEquals("Stud1",student.getName());
        assertEquals(1234,student.getId());
        assertEquals(3.5, student.getGpa(),0);
    }

    @Test
    public void display() throws Exception {
        hts.addStudent(1234,"stud1",4.0 );
        hts.addStudent(1235,"stud2",3.5 );
        hts.addStudent(1236,"stud3",3.0 );

        Map<Integer,HashTableSample.Student   > employees = hts.getStudents();

        for(HashTableSample.Student stud: employees.values() ){
            if(stud.getName().equals("stud1") || stud.getName().equals("stud2")
                || stud.getName().equals("stud3")){
                continue;
            }else{
                throw new Exception("Not expected result");
            }
        }
    }

    @Test
    public void displayHighScoreStudent() throws Exception {
        hts.addStudent(1234,"stud1",4.0 );
        hts.addStudent(1235,"stud2",3.5 );
        hts.addStudent(1236,"stud3",3.0 );

        Assert.assertEquals("stud1",hts.displayHighScoreStudent());

        hts.addStudent(1234,"stud5",2.0 );
        hts.addStudent(1235,"stud4",2.5 );
        hts.addStudent(1236,"stud6",4.5 );

        Assert.assertEquals("stud6",hts.displayHighScoreStudent());

    }

}