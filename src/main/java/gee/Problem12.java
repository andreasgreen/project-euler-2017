package gee;

import java.util.logging.Logger;

/**
 * Created by andreas on 2017-10-28.
 */
public class Problem12 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {

        long prev = getNextTriangle(0, 1);
        for(int i = 2 ; i < 100000 ; i++) {
            long next = getNextTriangle(prev, i);
            prev = next;
            long divs = countDiv(next);

            if(divs > 500) {
                logger.info("Found " + next + " " + i);
                break;
            }
        }
    }

    private static long countDiv(long l) {
        long maxD = (long) Math.sqrt(l);
        long count = 0;

        for(long cand = 1 ; cand <= maxD; cand++) {
            if(l % cand == 0) {
                //logger.info(cand + " is a divisior of " + l);
                count++;
                long newCandidate = l / cand;
                if (l % newCandidate == 0) {
                    //logger.info("But so is also " + newCandidate);
                    count++;
                }
            }
        }
        return count;
    }

    private static long getNextTriangle(long prev, long n) {
        return prev + n;
    }

}
