package gee;

import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;


public class Problem24 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {

        //List<Integer> numbers = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

        String s = "0123456789";
        List<String> permutations = new ArrayList<>();

        Problem24.getPermutations("", s, permutations);

        Collections.sort(permutations);

        // logger.info(permutations.toString());

        String perm1000000 = permutations.get(1000000-1);

        logger.info(perm1000000);

    }

    private static void getPermutations(String prefix, String letters, List<String> permutations) {
        if (letters.length() == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < letters.length(); i++) {
                String letter = letters.substring(i, i + 1);
                String otherLetters = letters.substring(0, i) + letters.substring(i + 1);
                getPermutations(prefix + letter, otherLetters, permutations);
            }
        }
    }
}
