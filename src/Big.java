import java.math.BigInteger;

public class Big {

    public static void main(String[] args) {
        printTable(9001);
    }

    public static void printTable(int num) {
        for(int i = 0; i <= num; ++i) {
            BigInteger factorial = BigInteger.ONE;
            for(int j = 1; j <= i; ++j) {
                factorial = factorial.multiply(BigInteger.valueOf(j));
            }
            System.out.printf("%d! = %d%n", i, factorial);
        }}}