package com.example.design_patterns.stratergy;


import org.springframework.stereotype.Service;

@Service("car")

public class CarPath implements PathFInder{
    @Override
    public Object findPath(String mode, Object payload) {
        return "car path found !";
    }
}
