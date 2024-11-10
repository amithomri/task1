// 211321823 Amit Homri

/**.
 * factorial class
 */
public class Factorial {
    /**
     * factoiral recorsive func .
     * @param n number for factorial
     * @return factorial result of .
     */
    public static int recorsiveFactorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * recorsiveFactorial(n - 1);
    }

    /**
     * @param n number for
     * @return factorial of number
     */
    public static int iterativeFactorial(int n) {

        int iterable = n, factorial = 1;
        if (iterable <= 0) {
            return 0;
        }
        while (iterable > 0) {
            factorial = factorial * iterable;
            iterable--;
        }
        return factorial;
    }

    /**.
     * prints recorsive and iterative factorial of number
     * @param args args is number for factorial
     */
    public static void main(String[] args) {
        System.out.println("recorsive : " + recorsiveFactorial(Integer.parseInt(args[0])));
        System.out.println("iterative : " + iterativeFactorial(Integer.parseInt(args[0])));
    }
}