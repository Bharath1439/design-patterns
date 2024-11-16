package com.example.design_patterns.prototype;

public class Client {

    private static void fillRegistry(StudentRepo studentRepo){
        Student student=new Student();
        student.setBatchName("firstBatch");
        student.setName("bharath");
        studentRepo.registry("firstBatch",student);


        IntelligentStudent intelligentStudent=new IntelligentStudent();
        intelligentStudent.setIq("1");
        intelligentStudent.setName("praveen");
        intelligentStudent.setBatchName("o");
        studentRepo.registry("0",intelligentStudent);
    }

    public static void main(String[] args){
        StudentRepo studentRepo=new StudentRepo();
        fillRegistry(studentRepo);


        Student dhaval=studentRepo.getStudent("firstBatch").clone();
        dhaval.setAge(23);
        dhaval.setName("dhavel");


        IntelligentStudent intelligentStudent=(IntelligentStudent)studentRepo.getStudent("o").clone();
        intelligentStudent.setIq("2");

    }
}
