package com.example.design_patterns.builder;

import com.example.design_patterns.builder.Exception.StudentExcpetion;

public class StudentV3 {
    private int age;

    private String name;

    private String gemder;

    private String grade;

    //v1
    public StudentV3(BuilderV3 builder){
        //any validation if required
        this.age=builder.getAge();
        this.name=builder.getName();
        this.grade= builder.getGrade();
        this.gemder= builder.getGemder();
    }

    //v2
    public static BuilderV3 studentBuilder(){
        return new BuilderV3();
    }
    public static class BuilderV3 {
        private int age;

        private String name;

        private String gemder;

        public int getAge() {
            return age;
        }

        public BuilderV3 setAge(int age) {
            this.age = age;
            return this;
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

        public BuilderV3 setGemder(String gemder) {
            this.gemder = gemder;
            return this;
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
        public StudentV3 builder() throws StudentExcpetion {

            if(!validate()){
                throw new StudentExcpetion();
            }
            //all validations are here

            return new StudentV3(this);
        }

    }
}
