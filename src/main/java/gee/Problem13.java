package gee;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by andreas on 2017-10-28.
 */
public class Problem13 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {

        Path p = Paths.get("src/resources/problem13.txt");
        List<String> lines = Files.readAllLines(p, StandardCharsets.UTF_8);

        BigInteger sum = new BigInteger("0");

        logger.info("Sum " + sum);

        for(String line : lines) {
            BigInteger fiftyDigitNumber = new BigInteger(line);
            sum = sum.add(fiftyDigitNumber);
        }

        String s = "" + sum;

        logger.info("Sum " + sum);
        logger.info("Sum " + s.substring(0,10));
    }


}
