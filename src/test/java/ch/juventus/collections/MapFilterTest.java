package ch.juventus.collections;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapFilterTest {

    static MapFilter mapFilter;

    @BeforeAll
    static void initAll(){
        mapFilter = new MapFilter();
    }

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
        Map<Integer, String> newMap = mapFilter.cleanup(map, "Test");
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
        expectedResult.put(1, 10);
        expectedResult.put(3, 10);
        expectedResult.put(5, 12);
        // MapFilter auslösen
        Map<Integer, Integer> newMap = mapFilter.cleanup(map, 11);
        // Prüfen
        assertEquals(newMap, expectedResult);
    }
}