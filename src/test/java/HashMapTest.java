import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class HashMapTest {

    @Test
    void putTest(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "один");
        String map2 = map.get(1);

        assertEquals(map2, "один");
    }

    @Test
    void keySetTest(){
        Map<Integer, String> map = new HashMap<>();
        Set<Integer> keys = new HashSet<>();
        keys.add(1);
        keys.add(2);
        map.put(1, "один");
        map.put(2,"два");
        Set<Integer> keysMap = map.keySet();

        assertEquals(keys, keysMap);
    }

    @Test
    void valuesTest(){
        Map<Integer, String> map = new HashMap<>();
        List<String> values = new ArrayList<>(Arrays.asList("один", "два"));
        map.put(1, "один");
        map.put(2,"два");
        List<String> valuesMap = new ArrayList<>(map.values());
        assertEquals(values, valuesMap);
    }

    @Test
    void removeTest(){
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        map.put(1, "один");
        map.put(2,"два");
        map2.put(1,"один");
        map.remove(2);

        assertEquals(map, map2);
    }

    @Test
    void sizeTest(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "один");
        map.put(2, "два");

        int sizeMap = map.size();
        assertEquals(sizeMap, 2);
    }
}