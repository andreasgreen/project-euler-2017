package gee;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Logger;


public class Problem14 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {
        int longestChain = 0;

        for(long start = 1 ; start < 1000000+1; start++) {
            long next = start;
            int chainLength = 0;
            String chain = Long.toString(next);

            while(next != 1) {
                chainLength++;
                next = getNext(next);
                chain += " -> " + next;

            }

            chainLength++; // include last 1 term

            if (chainLength >= longestChain) {
                longestChain = chainLength;
                logger.info(" [" + chainLength + ", started @ " + start + "] " + chain);
            }

        }

        logger.info("Done");
    }

    private static long getNext(long n) {
        if(isEven(n)) {
            return n/2;
        } else {
            return 3*n + 1;
        }

    }

    private static boolean isEven(long n) {
        return n % 2 == 0;
    }


}
