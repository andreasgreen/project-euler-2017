package gee;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;


public class Problem38 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {

        long largest = 0;

        for (int i = 1; i < 100000000; i++) {
            boolean stillInteresting = true;
            String concat = "";
            int n = 1;

            while(stillInteresting) {
                long p = i * n;
                concat += Long.toString(p);

                //check if

                if(concat.length() == 9) {
                    long l = Long.parseLong(concat);
                    if(Common.isPandigital(l, 9)) {
                        if (l > largest) {
                            largest = l;
                        }

                        logger.info("Found " + concat + " based on " + i + " and " + n);
                    }

                } else if(concat.length() > 9) {
                    stillInteresting = false;
                }

                n++;

            }
        }

        logger.info("Largest: " + largest);
    }


}


