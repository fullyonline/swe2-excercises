package ch.juventus.collections;

import java.util.HashMap;
import java.util.Map;

public class MapFilter<T> {

    public Map<Integer, T> cleanup(Map<Integer, T> map, T value){
        Map<Integer, T> newMap = new HashMap<>();

        map.forEach((key, val) -> {
            if(val == value){
                newMap.put(key, val);
            }
        });

        return newMap;
    }
}
