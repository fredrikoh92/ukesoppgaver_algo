package Uke35;

import hjelpeklasser.Data;
import hjelpeklasser.TableFunctions;

public class S121O1 {

    public static void main (String [] args) {
        int[] values = Data.values112;
        System.out.println("The minimum value of the array can be found at index:");
        System.out.println(TableFunctions.min(values,0,6));
    }
}
