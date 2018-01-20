package gee;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.LongStream;


public class Problem21 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {
        Set<Long> foundAmicable = new HashSet<>();
        long sum = 0;

        for(long candidate = 0 ; candidate < 10000 ; candidate++) {
            long l = d(candidate);
            if (candidate != l && d(l) == candidate && !foundAmicable.contains(candidate) && !foundAmicable.contains(l)) {
                logger.info("Found " + candidate + " " + l);
                foundAmicable.add(l);
                foundAmicable.add(candidate);
                sum = sum + l + candidate;
            }
        }

        logger.info(Long.toString(sum));
    }

    private static long d(long n) {
        long sum = 0;

        for(long l = 1 ; l < n / 2 + 1 ; l++) {
            if(n % l == 0) {
                sum += l;
            }
        }

        return sum;
    }

}
