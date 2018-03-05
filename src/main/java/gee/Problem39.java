package gee;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.logging.Logger;


public class Problem39 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {

        int biggestP = 0, biggestNrSolutions = 0;
        for (int p = 1; p <= 1000; p++) {
            Set<String> solutions = new HashSet<>();

            for (int a = 1; a <= p - 2; a++) {
                for (int b = 1; b <= p - 1 - a; b++) {
                    //for (int c = 1; c <= p - a - b; c++) {
                    double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
                    if(a+b+c == p) {
                        // is right angle
                        List<Integer> l = new ArrayList<>();
                        l.add(a); l.add(b); l.add((int) c);
                        Collections.sort(l);
                        solutions.add(l.toString());
                        //logger.info(l.toString() + " for p " + p);
                    }
                    //}
                }
            }

            if(solutions.size() > biggestNrSolutions) {
                biggestP = p;
                biggestNrSolutions = solutions.size();
                logger.info("new biggest for p " + p + " and " + solutions.size() + " " + solutions.toString());
            }

        }

    }



}
