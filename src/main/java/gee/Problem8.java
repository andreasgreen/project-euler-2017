package gee;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by andreas on 2017-10-29.
 */
public class Problem8 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {
        Path p = Paths.get("src/resources/problem8.txt");
        List<String> lines = Files.readAllLines(p, StandardCharsets.UTF_8);
        String longNumber = lines.get(0);

        int nrAdjacent = 13;
        long biggestSum = 0;

        for(int idx = 0 ; idx < longNumber.length() ; idx++) {
            // gather numbers

            if(idx + nrAdjacent <= longNumber.length()) {
                long sum = 1;

                for(int i = 0 ; i < nrAdjacent ; i++) {
                    sum = sum * Long.parseLong(Character.toString(longNumber.charAt(idx+i)));
                }

                if(sum > biggestSum) {
                    biggestSum = sum;
                }

            } else {
                logger.info("Can't collect anymore candidates " + idx);
                break;
            }
        }

        logger.info(Long.toString(biggestSum));
    }
}
