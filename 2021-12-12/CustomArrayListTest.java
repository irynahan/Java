import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CustomArrayListTest {

    @Test
    public void testGet() {
        // given
        CustomArrayList<Integer> targetInt = new CustomArrayList<>();
        targetInt.add(1);
        targetInt.add(2);
        targetInt.add(3);

        CustomArrayList<String> targetStr = new CustomArrayList<>();
        targetStr.add("A");
        targetStr.add("BB");
        targetStr.add("CCC");

        // when, then
        assertEquals(1, targetInt.get(0));
        assertEquals(3, targetInt.get(2));
        assertEquals("A", targetStr.get(0));
        assertEquals("CCC", targetStr.get(2));

        assertThrows(CustomOutOfBoundsException.class, () -> {
            targetInt.get(999);
        });

    }

    @Test
    public void testSet() {
        // given
        CustomArrayList<Integer> targetInt = new CustomArrayList<>();
        targetInt.add(1);
        targetInt.add(2);
        targetInt.add(3);

        CustomArrayList<String> targetStr = new CustomArrayList<>();
        targetStr.add("A");
        targetStr.add("BB");
        targetStr.add("CCC");

        // when
        targetInt.set(0, 5);
        targetStr.set(2, "DDDD");

        // then
        assertEquals(5, targetInt.get(0));
        assertEquals("DDDD", targetStr.get(2));
        assertThrows(CustomOutOfBoundsException.class, () -> {
            targetStr.set(4, "Q");
        });
    }

    @Test
    public void testSize() {
        // given
        CustomArrayList<Integer> targetInt = new CustomArrayList<>();
        targetInt.add(1);
        targetInt.add(2);
        targetInt.add(3);

        CustomArrayList<String> targetStr = new CustomArrayList<>();
        targetStr.add("A");
        targetStr.add("BB");

        // when, then
        assertEquals(3,targetInt.size());
        assertEquals(2,targetStr.size());
    }

    @Test
    public void testContains() {
        // given
        CustomArrayList<Integer> targetInt = new CustomArrayList<>();
        targetInt.add(1);
        targetInt.add(2);
        targetInt.add(3);
        targetInt.add(2);


        CustomArrayList<String> targetStr = new CustomArrayList<>();
        targetStr.add("A");
        targetStr.add("BB");
        targetStr.add("A");
        targetStr.add("BB");
        targetStr.add("CCC");

        // when, then
        assertTrue(targetInt.contains(2));
        assertFalse(targetInt.contains(10));
        assertTrue(targetStr.contains("CCC"));
        assertFalse(targetStr.contains("MMM"));
    }

    @Test
    public void testRemoveByID() {
        // given
        CustomArrayList<Integer> targetInt = new CustomArrayList<>();
        targetInt.add(1);
        targetInt.add(2);
        targetInt.add(3);
        targetInt.add(2);


        CustomArrayList<String> targetStr = new CustomArrayList<>();
        targetStr.add("A");
        targetStr.add("BB");
        targetStr.add("A");
        targetStr.add("BB");
        targetStr.add("CCC");

        // when, then
        assertEquals(1, targetInt.removeById(0));
        assertEquals(3, targetInt.removeById(1));
        assertThrows(CustomOutOfBoundsException.class, () -> {
            targetInt.removeById(3);
        } );

        assertEquals("A", targetStr.removeById(2));
        assertEquals("CCC", targetStr.removeById(3));
   }

    @Test
    public void testRemoveByValue() {
        // given
        CustomArrayList<Integer> targetInt = new CustomArrayList<>();
        targetInt.add(1);
        targetInt.add(2);
        targetInt.add(3);
        targetInt.add(2);


        CustomArrayList<String> targetStr = new CustomArrayList<>();
        targetStr.add("A");
        targetStr.add("BB");
        targetStr.add("A");
        targetStr.add("BB");
        targetStr.add("CCC");

        // when, then
        assertTrue(targetInt.removeByValue(2));
        assertFalse(targetInt.removeByValue(4));
        assertTrue(targetStr.removeByValue("A"));
        assertFalse(targetStr.removeByValue("CCCC"));
    }

    @Test
    public void testAdd() {
        // given
        CustomArrayList<String> targetStr = new CustomArrayList<>();
        targetStr.add("A");
        targetStr.add("BB");
        targetStr.add("A");
        targetStr.add("BB");
        targetStr.add("CCC");

        // when
        targetStr.add("HHHHH");
        // then
        assertEquals("HHHHH", targetStr.get(targetStr.size() - 1));
    }

    @Test
    public void testInsert() {
        // given
        CustomArrayList<Integer> targetInt = new CustomArrayList<>();
        targetInt.add(1);
        targetInt.add(2);
        targetInt.add(3);
        targetInt.add(2);


        CustomArrayList<String> targetStr = new CustomArrayList<>();
        targetStr.add("A");
        targetStr.add("BB");
        targetStr.add("A");
        targetStr.add("BB");
        targetStr.add("CCC");

        // when
        targetInt.insert(0, 100);
        targetInt.insert(4, 1000);
        targetInt.insert(3, 2000);

        // then
        assertEquals(100, targetInt.get(0));
        assertEquals(1, targetInt.get(1));
        assertEquals(2, targetInt.get(6));
        assertThrows(CustomOutOfBoundsException.class, () -> {
            targetStr.insert(6,"G");
        });
    }
}
