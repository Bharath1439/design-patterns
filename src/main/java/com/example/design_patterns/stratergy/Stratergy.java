package com.example.design_patterns.stratergy;

public class Stratergy {

    public Object findPathForUser(){
        String mode="car";
        PathFactory pathFactory=new PathFactory();
        return pathFactory.getMode(mode).findPath(mode,"");
    }
}
