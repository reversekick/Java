/*
 * Copyright (c) 2017 Bitlrn Inc.
 * All rights reserved.
 */

package com.bitlrn.intro.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapSample {
    class Employee {
        private final long id;
        private final String name;
        private final double salary;

        public Employee(long id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public long getId() {
            return id;
        }
    }
    Map<Integer,Employee> employees = new HashMap<Integer,Employee>();

    public Employee addEmployee(int id, String name, double sal) {
        Employee emp = new Employee(id, name, sal);
        employees.put(id, emp);
        return emp;
    }

    public Map<Integer,Employee> display(){
        for(Employee emp: employees.values()){
            System.out.println("id="+emp.getId());
            System.out.println("name="+emp.getName());
            System.out.println("sal="+emp.getSalary());
        }
        return employees;
    }

    public static void main(String[] args) {
        HashMapSample hms = new HashMapSample();
        System.out.println ("How many employees data you want to enter?");
        Scanner input = new Scanner(System.in);
        int noOfEmployees = input.nextInt();
        for(int i=1; i <= noOfEmployees; ++i){
            System.out.println("Enter employee " + i  + "info:");
            System.out.println("ID:");
            int id = input.nextInt();
            System.out.println("NAME:");
            String name = input.next();
            System.out.println("SALARY:");
            double sal = input.nextDouble();
            hms.addEmployee(id,name,sal);
        }

        hms.display();

    }

}
