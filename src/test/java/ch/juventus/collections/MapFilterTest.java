package ch.juventus.collections;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapFilterTest {

    @Test
    void stringMapFilter(){
        // Map füllen
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Test");
        map.put(2, "test");
        map.put(3, "Test");
        map.put(4, "test");
        map.put(5, "test");
        // Result Map
        Map<Integer, String> expectedResult = new HashMap<>();
        expectedResult.put(2, "test");
        expectedResult.put(4, "test");
        expectedResult.put(5, "test");
        // MapFilter auslösen
        MapFilter<String> mapFilter = new MapFilter<>();
        Map<Integer, String> newMap = mapFilter.cleanup(map, "test");
        // Prüfen
        assertEquals(newMap, expectedResult);
    }

    @Test
    void intMapFilter(){
        // Map füllen
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 11);
        map.put(3, 10);
        map.put(4, 11);
        map.put(5, 12);
        // Resultmap
        Map<Integer, Integer> expectedResult = new HashMap<>();
        expectedResult.put(2, 11);
        expectedResult.put(4, 11);
        // MapFilter auslösen
        MapFilter<Integer> mapFilter = new MapFilter<>();
        Map<Integer, Integer> newMap = mapFilter.cleanup(map, 11);
        // Prüfen
        assertEquals(newMap, expectedResult);
    }
}