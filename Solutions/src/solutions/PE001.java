/*
    Problem Statement:
    Find the sum of all the multiples of 3 or 5 below 1000.

    Date: 5/1/2017
    Author: Jeremiah Burley
*/
package solutions;
import java.util.*;

public class PE001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Define Local Variables
        List<Integer> multiplesFound = new ArrayList<>();
        int sum = 0;
        
        for (int i = 1; i < 1000; i++) {
            
            if ((i % 3 == 0) || (i % 5 == 0)) {
                multiplesFound.add(i);        
            }
        }
        
        for (int i = 0; i < multiplesFound.size(); i++) {
            sum += multiplesFound.get(i);
        }
        
        System.out.println("The Value is: " + sum);
    }
}

/* The Value is: 233168 */