package com.example.design_patterns.factory;

import com.example.design_patterns.factory.handler.DatabaseShiftingHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
@RequiredArgsConstructor
public class DataBaseFactory {

    private final Map<DataBaseEnum, DatabaseShiftingHandler> factoryMap;

    public DatabaseShiftingHandler getDataBaseShiftingHandler(DataBaseEnum dataBaseEnum){
        return factoryMap.get("service_"+dataBaseEnum.toString().toLowerCase());
    }
}
