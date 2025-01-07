package com.example.design_patterns.decorator;

public class StrawBerryTopping implements IceCreamConeConstraints{

    private IceCreamConeConstraints iceCreamConeConstraints;

    public StrawBerryTopping(IceCreamConeConstraints iceCreamConeConstraints){
        this.iceCreamConeConstraints=iceCreamConeConstraints;
    }



    @Override
    public int getCost() {
        return iceCreamConeConstraints.getCost()+30;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstraints.getDescription()+"StrawBerryTopping";
    }
}
