package com.example.design_patterns.stratergy;

import org.springframework.stereotype.Service;

@Service("bike")
public class BikePath implements PathFInder{
    @Override
    public Object findPath(String mode, Object payload) {
        return "bike path finder!";
    }
}
