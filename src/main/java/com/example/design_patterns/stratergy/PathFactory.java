package com.example.design_patterns.stratergy;

import java.util.HashMap;
import java.util.Map;

public class PathFactory {

    Map<String,PathFInder> pathMap=new HashMap<>();

    public PathFInder getMode(String mode){
        return pathMap.get(mode);

    }
}
