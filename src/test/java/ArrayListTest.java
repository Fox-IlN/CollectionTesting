import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

    @Test
    void addTest(){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        Integer actual = list.get(0);

        assertEquals(3, actual);
    }

    @Test
    void getTest(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer actual = list.get(2);

        assertEquals(3, actual);
    }

    @Test
    void setTest(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 0, 4, 5));
        list2.set(2, 3);

        assertEquals(list, list2);
    }

    @Test
    void removeTest(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 4, 5));
        Integer value = 3;
        list.remove(value);

        assertEquals(list, list2);
    }

    @Test
    void sizeTest(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int sizeList = list.size();

        assertEquals(5, sizeList);
    }

}