package com.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaTask2Tests {
    public Map<String, String> method1(Map<String, String> map) {
/*
        Modify and return the given map as follows,
        if the keys "a" and "b" are both in the map and have equal values, remove them both.

 */

        return map;
    }

    @Test
    public void firstTest() {
        Map actualMap = new HashMap(Map.of("a", "aaa", "b", "aaa", "c", "cake"));
        method1(actualMap);
        Assertions.assertEquals(actualMap, Map.of("c", "cake"));


        Map actualMap2 = new HashMap(Map.of("a", "aaa", "b", "bbb"));
        method1(actualMap2);
        Assertions.assertEquals(actualMap2, Map.of("a", "aaa", "b", "bbb"));

        Map actualMap3 = new HashMap(Map.of("a", "aaa", "b", "bbb", "c", "aaa"));
        method1(actualMap3);
        Assertions.assertEquals(actualMap3, Map.of("a", "aaa", "b", "bbb", "c", "aaa"));



    }

}
