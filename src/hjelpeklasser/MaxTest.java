package hjelpeklasser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxTest {

    @Test
    void max() {
        int[] values = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
        // int[] values = {-1, 5, 3, 1};
        int expected = 5;

        assertEquals(expected, TableFunctions.max(values, 0,8));
    }
}