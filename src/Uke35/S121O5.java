package Uke35;

import hjelpeklasser.Data;

public class S121O5 {
    public static void main (String [] args) {
        int[] testValues = Data.values112;

        // Declares what type (int) of values are in the list
        // Gives a name (k) for the variables that you want to loop through in the list
        // Sends in the name (testvalues) of the list that you want to loop through
        for (int k : testValues) {
            System.out.print(k + ", ");
        }
    }
}
