package ch.juventus.collections;

import java.util.Collections;
import java.util.Map;

public class MapFilter {

    public <K, V> Map<K, V> cleanup(Map<K, V> map, V value){
        if(map == null || map.isEmpty()){
            return Collections.emptyMap();
        }

        map.entrySet().removeIf(entry -> entry.getValue().equals(value));

        return map;
    }
}
