package com.example.design_patterns.decorator;

public class OrangeCone implements IceCreamConeConstraints{


    private IceCreamConeConstraints iceCreamConeConstraints;

    public  OrangeCone(){

    }
    public  OrangeCone(IceCreamConeConstraints iceCreamConeConstraints){
        this.iceCreamConeConstraints=iceCreamConeConstraints;
    }

    @Override
    public int getCost() {
        if(iceCreamConeConstraints!=null){
            return iceCreamConeConstraints.getCost()+20;
        }
        return 20;
    }

    @Override
    public String getDescription() {
         if(iceCreamConeConstraints!=null){
            return iceCreamConeConstraints.getDescription()+"orangeCone";
        }
        return "orange cone";
    }
}
