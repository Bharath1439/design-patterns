package com.example.design_patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRepo {

    Map<String,Student> studentRegistry=new HashMap<>();



    public void registry(String key,Student student){
        studentRegistry.put(key,student);
    }
    public Student getStudent(String key){
        if(studentRegistry.containsKey(key)){
            return studentRegistry.get(key);
        }
       return null;
    }


}
