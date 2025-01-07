package com.example.design_patterns.factory.handler;

public interface DatabaseShiftingHandler<T> {

    T getDataBasePayload(Object payload);

}
