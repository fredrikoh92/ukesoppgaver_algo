package Uke34;

import hjelpeklasser.TableFunctions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S112O2Test {

    @Test
    void min() {
        // Test data
        // -- normal array:
        int[] values = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
        // -- empty array:
        // int[] values = {};

        int expected = 6; // Expected value
        // function run, with comparison
        assertEquals(expected, TableFunctions.min(values));
    }
}