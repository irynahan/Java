import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Pairwise2Test {
    Pairwise2 testInst = new Pairwise2();

    @Test
    public void testTwoMaxMultiplyArray1() {
        // given
        int[] array = {1};
        // then
        assertThrows(IllegalArgumentException.class, ()->{
            // when
            testInst.twoMaxMultiply(array);
        });
    }

    @Test
    public void testTwoMaxMultiplyArray2() {
        // given
        int[] array2 = {1, 2};
        // when
        long result = testInst.twoMaxMultiply(array2);
        // then
        assertEquals(2, result);
    }

    @Test
    public void testTwoMaxMultiplyArrayLong() {
        // given
        int[] array3 =  {1000000, 100, 4000000, 5000000};
        // when
        long result = testInst.twoMaxMultiply(array3);
        // then
        assertEquals(20000000000000l, result);
    }


}