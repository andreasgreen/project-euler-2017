package gee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;


public class Problem49 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {
        for (long a = 1000; a < 10000; a++) {
            if(Common.isPrime(a)) {
                //first is prime
                // check possible series.
                for (int step = 1; step + a < 9000  ; step++) {
                    long b = a + step;
                    long c = a + 2*step;

                    if(Common.isPrime(b) && Common.isPrime(c)) {
                        List<String> perms = new ArrayList<>();
                        Common.getPermutations("", Long.toString(a), perms);
                        if(perms.contains(Long.toString(b)) && perms.contains(Long.toString(c))) {
                            logger.info("a=" + a + " b=" + b + " c=" + c);
                            logger.info("" + a + b + c);
                        }
                    }
                }
            }
        }


    }

}
