package com.example.design_patterns.builder;

import com.example.design_patterns.builder.Exception.StudentExcpetion;

public class Client {
    public static void main(String[] args) throws StudentExcpetion {

        //v1
        Builder builder = new Builder();
        builder.setAge(21);
        builder.setName("bharath");
        builder.setGemder("male");
        builder.setGrade("A");

        Student student = new Student(builder);

        //v2
        Builder builder1 = Student.studentBuilder();

        builder1.setAge(21);
        builder1.setName("bharath");
        builder1.setGemder("male");
        builder1.setGrade("A");

        Student student1 = builder1.builder();

        //v3

        //in the above 2 versions i can create the object of student directly also instead of
        // dependeing on builder class but it should depend on builder class so we need to make
        // the sudent class constrcutor private and need to copy paste whole builder class in
        // student

        StudentV3 studentV3 = StudentV3.studentBuilder()
                .setAge(21).setGemder("name").builder();
    }
}
