package hjelpeklasser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class minTest {

    @Test
    void min() {
        int[] values = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
        int expected = 6;

        assertEquals(expected, TableFunctions.min(values, 0,8));
    }
}