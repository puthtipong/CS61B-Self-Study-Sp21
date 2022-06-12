/** Class that prints the Collatz sequence starting from a given number.
 *  @author Puthtipong Thunyatada
 */
public class Collatz {

    /** Buggy implementation of nextNumber! */
    public static int nextNumber(int n) {
        /** Takes in input int n and returns the next number in the Collatz conjecture*/
        if (n % 2==0) {
            return n/2;
        } else if (n % 2 != 0) {
            return 3 * n + 1;
        }
        return 1;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

