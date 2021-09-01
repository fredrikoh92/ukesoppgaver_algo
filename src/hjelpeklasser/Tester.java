package hjelpeklasser;

import java.util.NoSuchElementException;

public class Tester {

    /**
     * emptyIntegerArrayCheck  Checks if an array is empty and returns a message to the user if it is empty
     * @param a         An integer array
     */
    public static void emptyIntegerArrayCheck (int[] a) {
        if (a.length < 1) throw new java.util.NoSuchElementException("Table is empty");
    }

    public static void illegalIntervalMaxMethod (int[] a, int from, int to) {
        if (from < 0 || to > a.length || from >= to) throw new IllegalArgumentException("Illegal interval!");

    }

    public static void negativeFromNumberCheck (int from) {
        if (from < 0) throw new ArrayIndexOutOfBoundsException ("from (" + from + ") is negative!");
    }

    public static void fromToControl(int tableLength, int from, int to) {
        // If from is negative
        if (from < 0) throw new ArrayIndexOutOfBoundsException ("from(" + from + ") is negative!");
        // If to is outside the table
        if (to > tableLength) throw new ArrayIndexOutOfBoundsException ("to(" + to + ") > table length(" + tableLength + ")");
        // If from is greater than to
        if (from > to) throw new IllegalArgumentException ("from(" + from + ") > to(" + to + ") - illegal interval!");
        // If from to is the same (no values in array)
        if (from == to) throw new NoSuchElementException ("from(" + from + ") = to(" + to + ") - empty array interval!");
    }

    public static void fromToIncludeControl(int tableLength, int l, int r) {
        if (l < 0) throw new ArrayIndexOutOfBoundsException ("l(" + l + ") < 0");

        if (r >= tableLength) throw new ArrayIndexOutOfBoundsException ("r(" + r + ") >= tablengde(" + tableLength + ")");

        if (l > r + 1) throw new IllegalArgumentException ("l = " + l + ", r = " + r);
    }
}
