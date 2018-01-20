package gee;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Logger;


public class Problem22 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {
        Path p = Paths.get("src/resources/problem22.txt");
        List<String> allLines = Files.readAllLines(p, StandardCharsets.UTF_8);

        List<String> names = Arrays.asList(allLines.get(0).replaceAll("\"", "").split(","));
        Collections.sort(names);

        long sum = 0;

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);

            long score = getNameScore(name, i+1);
            logger.info(name + "[" + score  + "]");
            sum += score;
        }

        logger.info(Long.toString(sum));


    }

    private static long getNameScore(String name, int index) {
        long charSum = 0;

        for(char c : name.toCharArray()) {
            int val = CHARS.indexOf(c);
            charSum += val;
        }

        return charSum * index;
    }

    private static final String CHARS = "-ABCDEFGHIJKLMNOPQRSTUVWXYZ";
}
