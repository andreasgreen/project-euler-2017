package gee;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;


public class Problem32 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {

        int pan = 9;
        int nrFound = 0;
        Set<Long> ind = new HashSet<>();

        for (long i = 0; i < 10000; i++) {
            for (long j = 0; j < 10000; j++) {
                long prod = i*j;
                if(isPandigital(i, j, prod, pan)) {
                    logger.info(i + "x" + j + "=" + prod);
                    ind.add(prod);
                    nrFound++;
                }
            }
        }

        long sum = 0;
        for (Long aLong : ind) {
            sum += aLong;
        }

        logger.info("Tutti found " + nrFound + " " + sum);
    }

    private static boolean isPandigital(long a, long b, long c, int n) {
        String s = Long.toString(a) + Long.toString(b) + Long.toString(c);

        if(s.length() != 9) {
            return false;
        }

        for(int i = 1 ; i <= n ; i++) {
            if(!s.contains(Integer.toString(i))) {
                return false;
            } else {
                int idx = s.indexOf(Integer.toString(i));
                s = s.substring(0, idx) + s.substring(idx+1);
            }
        }

        return s.length() == 0;

    }

}
