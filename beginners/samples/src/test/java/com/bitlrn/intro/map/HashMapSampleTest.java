/*
 * Copyright (c) 2017 Cisco Systems, Inc.
 * All rights reserved.
 */

package com.bitlrn.intro.map;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class HashMapSampleTest {
    HashMapSample hms = null;
    @Before
    public void setUp() throws Exception {
        hms =new HashMapSample();
    }

    @Test
    public void addEmployee() throws Exception {
        HashMapSample.Employee employee = hms.addEmployee(1234,"Emp1",45.0 );
        assertEquals("Emp1",employee.getName());
        assertEquals(1234,employee.getId());
        assertEquals(45.0, employee.getSalary(),0);
    }

    @Test
    public void display() throws Exception {
        hms.addEmployee(1234,"Emp1",45.0 );
        hms.addEmployee(1235,"Emp2",50.0 );
        hms.addEmployee(1236,"Emp3",55.0 );

        Map<Integer,HashMapSample.Employee> employees = hms.display();

        for(HashMapSample.Employee emp: employees.values() ){
            if(emp.getName().equals("Emp1") || emp.getName().equals("Emp2")
                || emp.getName().equals("Emp3")){
                continue;
            }else{
                throw new Exception("Not expected result");
            }
        }
    }





}