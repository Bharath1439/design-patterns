package com.example.design_patterns.decorator;

public class client {
    public static void main(String [] args){


        IceCreamConeConstraints iceCreamConeConstraints=new StrawBerryTopping(new OrangeCone());

        //we need to call and here we need to have one base entity.
    }
}
