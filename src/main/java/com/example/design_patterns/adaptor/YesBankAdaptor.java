package com.example.design_patterns.adaptor;

public class YesBankAdaptor implements AdaptorInterface{

    YesBank yesBank=new YesBank();
    @Override
    public Object makePayment() {
        yesBank.yesBankPaymentProcess();
        return "sucess";
    }
}
