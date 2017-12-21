package demo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    @Test
    public void mapContainsKeys() {
        Map<Integer, String> sampleMap = new HashMap<>();
        sampleMap.put(1, "ONE");
        sampleMap.put(2, "TWO");
        sampleMap.put(3, "THREE");
    }

    @Test
    public void maContainsAllEntries() {
        Map<Integer, String> sampleMap = new HashMap<>();
        sampleMap.put(1, "ONE");
        sampleMap.put(2, "TWO");
        sampleMap.put(3, "THREE");
    }
}
