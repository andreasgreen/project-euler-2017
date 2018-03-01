package gee;

import java.io.IOException;
import java.util.logging.Logger;


public class Problem37 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {
        long sum = 0;
        int nrFound = 0;

        long candidate = 11;

        while (nrFound < 11) {
            if(isLeftTruncPrime(candidate) && isRightTruncPrime(candidate)) {
                logger.info("Found: " + candidate);
                nrFound++;
                sum += candidate;
            }

            candidate++;
        }

        logger.info("sum: " + sum);


    }

    private static boolean isLeftTruncPrime(long l) {
        String s = Long.toString(l);

        for(int i = 0 ; i < s.length() ; i++) {
            String tmp = s.substring(i);
            long cand = Long.parseLong(tmp);
            if(!Common.isPrime(cand)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isRightTruncPrime(long l) {
        String s = Long.toString(l);

        for(int i = s.length() ; i > 0 ; i--) {
            String tmp = s.substring(0,i);
            long cand = Long.parseLong(tmp);
            if(!Common.isPrime(cand)) {
                return false;
            }
        }

        return true;


    }





}


