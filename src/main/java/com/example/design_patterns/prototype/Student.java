package com.example.design_patterns.prototype;


import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Prototype{

    private String name;

    private int age;

    private double pst;

    private String batchName;

    private String averageBatchPsp;

    @Override
    public Student clone(){
        return new Student(this);


    }

    public Student(Student student){
        this.age=student.age;
        this.name=student.name;
        this.pst=student.pst;
        this.batchName=student.batchName;
        this.averageBatchPsp=student.averageBatchPsp;

    }
}
