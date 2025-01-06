package com.example.design_patterns.adaptor;

public class IciciAdaptor implements AdaptorInterface {

    IciciBank iciciBank=new IciciBank();
    @Override
    public Object makePayment() {
        iciciBank.iciciBankAmountPayment();
        return "success";
    }
}
