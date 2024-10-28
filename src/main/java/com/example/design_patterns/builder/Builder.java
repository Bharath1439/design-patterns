package com.example.design_patterns.builder;

import com.example.design_patterns.builder.Exception.StudentExcpetion;



public class Builder {
    private int age;

    private String name;

    private String gemder;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGemder() {
        return gemder;
    }

    public void setGemder(String gemder) {
        this.gemder = gemder;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    private String grade;

    //v2
    private boolean validate(){
        if(this.getGrade().equals("A")){
            return true;
        }
        return false;
    }

    //v2
    public Student builder() throws StudentExcpetion {

        if(!validate()){
            throw new StudentExcpetion();
        }
        //all validations are here

        return new Student(this);
    }

}
