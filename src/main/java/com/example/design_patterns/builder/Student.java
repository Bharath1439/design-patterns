package com.example.design_patterns.builder;

public class Student {

    private int age;

    private String name;

    private String gemder;

    private String grade;

    public Student(Builder builder){
        //any validation if required
        this.age=builder.getAge();
        this.name=builder.getName();
        this.grade= builder.getGrade();
        this.gemder= builder.getGemder();
    }

    public static Builder studentBuilder(){
        return new Builder();
    }

}
