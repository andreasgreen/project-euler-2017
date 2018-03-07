package gee;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;


public class Problem43 {
    private static final Logger logger = Logger.getAnonymousLogger();

    private static final int[] DIVS = {2,3,5,7,11,13,17};

    public static void main(String[] args) throws IOException {

        String s = "0123456789";
        List<String> perms = new ArrayList<>();
        Common.getPermutations("", s, perms);

        //logger.info("Perms " + perms);

        long sum = 0;

        for (String perm : perms) {
            if(perm.length() != 10) {
                continue;
            }

            long i = Long.parseLong(perm);
            if(Common.isPandigital(i, 9, 0)) {
                if(checkDivisibility(i)) {
                    logger.info("Found: " + i);
                    sum += i;
                }
            }

        }


       //logger.info(""+Common.isPandigital(1406357289, 9, 0));

       //logger.info(""+checkDivisibility(1406357289));

        logger.info("Done " + sum);
    }



    private static int getInt(int startIdx, String s) {
        String tmp = s.substring(startIdx, startIdx+3);

        return Integer.parseInt(tmp);
    }

    private static boolean checkDivisibility(long i) {
        String s = Long.toString(i);

        for (int j = 1; j < s.length() - 2; j++) {
            int k = getInt(j, s);
            //logger.info("Checking k " + k + " " + DIVS[j-1]);
            if(k % DIVS[j-1] != 0) {
                return false;
            }
        }

        return true;

    }



}
