package gee;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;


public class Problem42 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {

        Path p = Paths.get("src/resources/problem42.txt");
        List<String> allLines = Files.readAllLines(p, StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(allLines.get(0).replaceAll("\"", "").split(","));

        logger.info("words " + words);

        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int cnt = 0;

        logger.info("# words " + words.size());

        for (String word : words) {

            word = word.toUpperCase();
            int wordSum = 0;
            for (int i = 0; i < word.length(); i++) {

                char c = word.charAt(i);
                int idx = alpha.indexOf(c) + 1;
                wordSum += idx;
            }

            if(isTriangle(wordSum)) {
                logger.info("Triangle word: " + word + " sum: " + wordSum);
                cnt++;
            }

        }

        logger.info("Done " + cnt);
    }

    private static boolean isTriangle(int n) {
        // unsure of upper bound, n wasn't sufficient.
        for (int i = 1; i < 2*n; i++) {
            int tri = (int) ((1f/2)*i*(i+1));

            if(tri == n) {
                return true;
            }
        }
        return false;
    }


}
