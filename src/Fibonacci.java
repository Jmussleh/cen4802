/*A class with methods that return the nth term in the Fibonacci sequence
which accepts n as a parameter. This class also contains a main method that
calls the first method.
 */
public class Fibonacci {
    /**
     * Calculates the nth term of the Fibonacci sequence
     * @param n, the position in the Fibonacci sequence
     * @return the Fibonacci number at position n
     */
    //Recursive method for Fibonacci sequence
    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
    //Main method

    /**
     * Main method that calls the Fibonacci method and
     * prints the message with the nth term of the sequence
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        int result = Fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}