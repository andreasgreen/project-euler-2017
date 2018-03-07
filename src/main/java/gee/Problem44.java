package gee;

import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;
import java.util.regex.Matcher;


public class Problem44 {
    private static final Logger logger = Logger.getAnonymousLogger();


    public static void main(String[] args) throws IOException {

        //Pn=n(3n−1)/2.

        boolean found = false;
        int n = 1;
        Set<Long> pSet = new HashSet<>();
        List<Long> pList = new ArrayList<>();
        long bestDiff = Long.MAX_VALUE;
        String s = "";

        while (!found) {
            long pentagon = getPentagonNumber(n);
            n++;

            for (Long p1 : pList) {

                long diff = pentagon - p1.longValue();

                if(pSet.contains(diff)) {

                    // speed up:
                    if(Math.abs(diff) > bestDiff) {
                        continue;
                    }

                    long sum = p1 + pentagon;

                    if(isPentagon(sum, n-1)) {

                        if(Math.abs(diff) < bestDiff) {
                            bestDiff = Math.abs(diff);
                            s = "BEST: " + p1 + " " + pentagon + " diff: " + Math.abs(diff);
                            logger.info(s);
                        }

                        //found = true;
                    }
                }
            }

            pSet.add(pentagon);
            pList.add(pentagon);

        }

    }

    private static boolean isPentagon(long n, int currentIdx) {
        Set<Long> tmp = new HashSet<>();

        for (long i = currentIdx - 1; i < currentIdx + 10000; i++) {
            tmp.add(getPentagonNumber(i));
        }

        return tmp.contains(n);

       /* for (long l = 1 ; l < 3*n*n ; l++) {
            long tmp = getPentagonNumber(l);
            //logger.info("comparing " + tmp + " and " + n);
            if(tmp == n) {
                return true;
            } else if(tmp > n) {
                return false;
            }
        }

        return false;*/
    }

    private static long getPentagonNumber(long n) {
        return n*(3*n-1) / 2;
    }




}
