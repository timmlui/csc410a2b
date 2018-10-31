
package nl.tudelft.jpacman;

/**
 * Determine whether a positive integer n is called "squarefree"
 * if no square of a prime divides n.
 * 1, 2, 3, 5, 6, 7, 10, 11 are squarefree
 * but 4, 8, 9, 12 are not.
 */
public class SquareFree {

    public static void main(String[] args) {
        SquareFree s = new SquareFree();
        s.isSquareFree(4);
    }
  
    public boolean isSquareFree(int n) {
        // If n is 0 or negative
        if (n <= 0) {
            return false;
        }
        if (myMod(n, 2) == 0) {
            n = myDivision(n, 2);

            // If 2 divides n again, then its not squarefree
            if (myMod(n, 2) == 0) {
                return false;
            }
        }
        // n is odd now, so increment i by 2
        for (int i = 3; i <= n; i = i + 2) {
            // check that i is prime
            if (myMod(n, i) == 0) {
                n = myDivision(n, i);
                
                // if i divides n, then its not squarefree
                if (myMod(n, i) == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Division using simple math
     * @param x
     * @param y
     * @return int
     */
    public int myDivision(int x, int y) {
        int i = 0;
        if (x < y) {
            return 0;
        }
        while (x >= y) {
            x -= y;
            i++;
        }
        return i;
    }

    /**
     * Modulo using simple math
     * @param x
     * @param y
     * @return int
     */
    public int myMod(int x, int y) {
        if (x < y) {
            return x;
        }
        while (x >= y) {
            x -= y;
        }
        return x;
    }
}