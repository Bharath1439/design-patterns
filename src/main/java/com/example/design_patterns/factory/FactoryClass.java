package com.example.design_patterns.factory;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FactoryClass {

    private final DataBaseFactory dataBaseFactory;

    public Object getPayload(){
        return dataBaseFactory.getDataBaseShiftingHandler(DataBaseEnum.MYSQL);

    }
}
