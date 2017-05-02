/*

    Problem Statement:

    If we list all the natural numbers below 10 that are multiples of
    3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

    Find the sum of all the multiples of 3 or 5 below 1000.

*/
package playingwitharrays;
import java.util.Scanner; 
/**
 *
 * @author rwdhburley
 */
public class PE001Multples3and5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declare local Variables
        int[][] twoDimArry = new int[4][4];
        int num = 1;
        

        // Populate two deminsion array
        for (int i = 0; i <= twoDimArry.length; i++) {
            System.out.print(num + "\t");
            num++;
            
            for (int j = 0; j <= twoDimArry.length; j++) {
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();    
        }
    
        // Ask User for Row and Colume
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.print("Please choose one of the numbers above: ");
        int userNum = reader.nextInt(); // Scans the next token of the input as an int.
        
        num = 1;
        // Populate two deminsion array
        for (int i = 0; i <= twoDimArry.length; i++) {
            
            if (num == userNum) {
                char smiley1 = (char)1;
                System.out.print('\u263A' + "\t");
                num++;
            }
            else {
                System.out.print(num + "\t");
                num++;
            }
            

            
            for (int j = 0; j <= twoDimArry.length; j++) {
                if (num == userNum) {
                    char smiley1 = (char)1;
                    System.out.print('\u263A' + "\t");
                    num++;
                }
                else {
                    System.out.print(num + "\t");
                    num++;
                }
            
            }
            System.out.println();    
        }
    }
}
