package com.example.design_patterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IntelligentStudent extends Student{

    private String iq;

    public IntelligentStudent(IntelligentStudent intelligentStudent){
        super(intelligentStudent);
        this.iq=intelligentStudent.iq;
    }

    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}
