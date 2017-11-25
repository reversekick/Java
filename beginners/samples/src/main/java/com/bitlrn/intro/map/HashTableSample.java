/*
 * Copyright (c) 2017 Bitlrn Inc.
 * All rights reserved.
 */

package com.bitlrn.intro.map;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;

public class HashTableSample {

    Hashtable<Integer, Student> students = new Hashtable<Integer,Student>();

    public HashTableSample.Student addStudent(int id, String name, double gpa) {
        Student newStudent = new Student(id,name,gpa);
        students.put(id,newStudent);
        return newStudent;
    }

    public Map<Integer,Student> getStudents(){
        for(Student stud: students.values()){
            System.out.println("id="+stud.getId());
            System.out.println("name="+stud.getName());
            System.out.println("gpa="+stud.getGpa());
        }
        return students;
    }

    public String displayHighScoreStudent() {
        Collection<Student> studs = students.values();
        Student[] scoreStudents = studs.toArray(new Student[0]);

        Student maxScore = scoreStudents[0];
        for(int i = 1; i < scoreStudents.length; ++i){
            if(scoreStudents[i].getGpa() > maxScore.getGpa()){
                maxScore = scoreStudents[i];
            }
        }
        return maxScore.getName();
    }

    public class Student {

        private final String name;
        private final int id;
        private final double gpa;

        public Student(int id,String name, double gpa) {
            this.name = name;
            this.id = id;
            this.gpa = gpa;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public double getGpa() {
            return gpa;
        }
    }
}
