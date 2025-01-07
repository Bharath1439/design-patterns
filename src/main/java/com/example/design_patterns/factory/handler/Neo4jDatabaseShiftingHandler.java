package com.example.design_patterns.factory.handler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service("service_neo4j")
public class Neo4jDatabaseShiftingHandler implements DatabaseShiftingHandler{
    @Override
    public Object getDataBasePayload(Object payload) {
        return "neo4j";
    }
}
