import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuelingNumberTest {

    @Test
    public void checkDistance0() {
        // given
        FuelingNumber target = new FuelingNumber();

        // when
        int answer = target.getFuelingNumber(950, 1400, new int[]{200, 375, 550, 750});

        // then
        assertEquals(0, answer);
    }

    @Test
    public void checkToBigDistanceBetweenStattions() {
        // given
        FuelingNumber target = new FuelingNumber();

        // then
        assertThrows(IllegalArgumentException.class, ()->{
            // when
            target.getFuelingNumber(1000, 200, new int[]{200, 375, 550, 700});
        });
    }

    @Test
    public void checkToBigLength() {
        // given
        FuelingNumber target = new FuelingNumber();

        // then
        assertThrows(IllegalArgumentException.class, ()->{
            // when
            target.getFuelingNumber(1500, 200, new int[]{200, 375, 550, 770});
        });
    }

    @Test
    public void checkDistance1() {
        // given
        FuelingNumber target = new FuelingNumber();

        // when
        int answer = target.getFuelingNumber(950, 400, new int[]{200, 375, 550, 750});

        // then
        assertEquals(2, answer);
    }

    @Test
    public void checkDistance2() {
        // given
        FuelingNumber target = new FuelingNumber();
        //                                                                                                650.
        // when                                                                   0    1    2    3    4    5    6    7    8     9
        int answer = target.getFuelingNumber(1300, 350, new int[]{100, 200, 300, 400, 500, 600, 700, 800, 900, 1100});

        // then
        assertEquals(4, answer);
    }

}