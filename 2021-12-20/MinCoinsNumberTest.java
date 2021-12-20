import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCoinsNumberTest {
    @Test
    public void checkNumberOfCoins_0(){
        assertThrows(IllegalArgumentException.class, () -> {
            new MinCoinsNumber().exchangeMoney(0);
        });
    }

    @Test
    public void checkNumberOfCoins_10(){
        assertEquals(1, new MinCoinsNumber().exchangeMoney(10));
    }

    @Test
    public void checkNumberOfCoins_16(){
        assertEquals(3, new MinCoinsNumber().exchangeMoney(16));
    }

    @Test
    public void checkNumberOfCoins_101(){
        assertEquals(11, new MinCoinsNumber().exchangeMoney(101));
    }

    @Test
    public void checkNumberOfCoins_136(){
        assertEquals(15, new MinCoinsNumber().exchangeMoney(136));
    }

    @Test
    public void checkNumberOfCoins_1563(){
        assertEquals(159, new MinCoinsNumber().exchangeMoney(1563));
    }

}