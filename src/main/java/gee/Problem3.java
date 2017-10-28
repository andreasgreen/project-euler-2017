package gee;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.logging.Logger;

/**
 * Created by andreas on 2017-10-28.
 */
public class Problem3 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        long number = 600851475143L;
        SortedSet<Long> primeFactors = new TreeSet<>();

        long remainder = number;

        for (long l = 2 ; l <= remainder ; l++) {
            if (Common.isPrime(l)) {
                while(remainder % l == 0) {
                    remainder = remainder / l;
                    primeFactors.add(l);
                }
            }
        }

        logger.info("Prime factors: " + primeFactors);
    }
}
