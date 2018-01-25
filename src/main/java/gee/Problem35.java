package gee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class Problem35 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {

        int nrCircularPrimes = 0;

        for (long i = 0; i < 1000000; i++) {
            if(Common.isPrime(i)) {
                List<Long> rotations = getRotations(i);

                boolean passed = true;
                for(Long permCandidate : rotations) {
                    if(!Common.isPrime(permCandidate)) {
                        passed = false;
                        break;
                    }
                }

                if(passed) {
                    nrCircularPrimes++;
                    logger.info(Long.toString(i));
                }
            }
        }

        logger.info("Nr circular primes " + nrCircularPrimes);

    }

    private static List<Long> getRotations(long l) {
        List<Long> rotations = new ArrayList<>();

        String s = Long.toString(l);

        for(int i = 0 ; i < s.length() - 1 ; i++) {
            s = s.substring(1) + s.charAt(0);
            rotations.add(Long.parseLong(s));
            //logger.info("Adding " + s + " based on " + l);
        }

        return rotations;
    }

}
