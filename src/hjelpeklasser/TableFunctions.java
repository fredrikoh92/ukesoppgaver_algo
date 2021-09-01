package hjelpeklasser;

import java.util.Arrays;

public class TableFunctions {
    // private TableFunctions() {}

    // Functions created so far:
    // -- fak(int tall)                         Calculates the faculty value of an integer
    // -- max(int[] tall)                       Finds index of max value in array
    // -- max(int[] tall, int from, int to)     Finds index of max value in an interval of an array
    // -- min(int tall):                        Finds index of min value in array
    // -- min(int[] tall, int from, int to)     Finds index of min value in an interval of an array
    // -- minmax(int[]):                        Finds index of both min and max value in array
    // -- printInterval:                        Prints the values of an array interval
    // -- switch(char[] c, int i, int j)        Switches position of to characters in an array

    /**
     * Method for calculating fakulty of a number
     * @param n         Basis integervalue in faculty calculation
     * @return value    Returns facultyvalue
     */
    public static long fak(int n) {
        int value = n;
        while(n > 1) {
            value *= (n - 1);
            n -= 1;
        }
        return value;
    }

    /**
     * max (from/to-interval)   This method finds the index of the max value of an interval in an array
     * @param a                 Array of integers
     * @param from              Index of the from-position
     * @param to                Index of the to-position
     * @return                  Returns the index of max value in the array interval
     */
    public static int max(int[] a, int from, int to) {
        // Checks if the interval specified is legal
        Tester.fromToControl(a.length, from, to);

        int m = from;              // indeks til største verdi i a[fra:til>
        int max_value = a[from];   // største verdi i a[fra:til>

        for (int i = from + 1; i < to; i++) {
            if (a[i] > max_value) {
                m = i;                // indeks til største verdi oppdateres
                max_value = a[m];     // største verdi oppdateres
            }
        }

        return m;  // index of largest value in an array interval in [from, to)
    }

    /**
     * max          Returns the index of the highest value in an integer array
     * @param a     An integer array
     * @return      Index of max value
     */
    public static int max(int[] a) {
        // Checks for empty array
        Tester.emptyIntegerArrayCheck(a);

        return max(a, 0, a.length);
    }


    /**
     * min            Returns the index of the lowest value in an integer array
     * @param   a     An integer array
     * @return  m     Index of the lowest value
     */
    /* FIRST MIN-METHOD IMPLEMENTATION
    public static int min(int[] a) {
        // Checks for empty array
        Tester.emptyIntegerArrayCheck(a);

        int low = 0; // Index of minimum value at start
        int min_value = a[low]; // Value of minimum value at start

        for (int i = 1; i < a.length; i++) {
            if(a[i] < min_value) {
                low = i;
                min_value = a[low];
            }
        }
        // returns index of minimum value
        return low;
    }*/

    /**
     * min            Returns the index of the lowest value in an integer array
     * @param   a     An integer array
     * @return  m     Index of the lowest value
     */
    public static int min(int[] a) {
        // Checks for empty array
        Tester.emptyIntegerArrayCheck(a);

        return min(a,0,a.length);
    }

    /**
     * min (from/to-interval)   A method that finds the index of the minimum value in a specific interval of an array
     * @param a                 An array of integers
     * @param from              An integer indicating the start index of the interval
     * @param to                An integer indicating the end index of the interval
     * @return                  Returns the index of the minimum value in the array
     */
    public static int min(int[] a, int from, int to) {

        // Check for empty array
        Tester.emptyIntegerArrayCheck(a);
        // Check for illegal array
        Tester.illegalIntervalMaxMethod(a, from, to);

        // Starts with the from-value
        int min_index = from;
        int min_value = a[from];

        // Loops through the interval to see if any values are lower than the first in the interval
        for (int i = from + 1; i < to; i++) {
            if (a[i] < min_value) {
                min_index = i;
                min_value = a[i];
            }
        }
        return min_index;
    }

    /**
     * minmaks          Returns the indexes of the minimum and maximum value in the array. The minimum value is at:
     *                  index 0, and the maximum value is at index 1
     * @param "values"    An array of integers
     * @return          Returns an array with the index position of the lowest and highest values in an array, like this:
     *                  [index_min, index_max]
     */
    public static int[] minmax(int[] values) {
        // Checks for empty array
        Tester.emptyIntegerArrayCheck(values);

        int min_value = values[0];
        int max_value = values[0];
        int[] index_values = {0,0};

        for(int i = 1; i < values.length - 1; i++) {
            if (values[i] < min_value) {
                min_value = values[i];
                index_values[0] = i;
            }
            if (values[i] > max_value) {
                max_value = values[i];
                index_values[1] = i;
            }
        }
        // Returns array with the index of min and max value in input array
        return index_values;
    }


    public static void printInterval(int[] a, int from, int to) {
        for(int num : a) {
            System.out.print(num + "");
        }
    }

    public static void printInterval(int[] a) {
        for (int i = 0; i < a.length -1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print(a[a.length - 1]);
    }

    /**
     * switchChar       This is a method that switches the place of two characters in an array
     * @param c         The array of characters
     * @param i         The index position of the first character
     * @param j         The index position of the second character
     */
    public static void switchChar(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }


    /**
     * Main metoden som er laget for å slippe at noen av funksjonene over skal være grået ut
     * @param args
     */
    public static void main (String [] args) {
        min(Data.values112);
        max(Data.values112);
        minmax(Data.values112);
        System.out.println(Arrays.toString(minmax(Data.values112)));
        printInterval(Data.values112, 1, 5);
        System.out.println("");
        printInterval(Data.values112);
    }
}
