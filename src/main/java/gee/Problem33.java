package gee;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;


public class Problem33 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {

        for (int i = 10; i < 100 ; i++) {
            for (int j = i + 1; j < 100 ; j++) {

                Fraction f = new Fraction(i, j);
                if(f.isProblem33Simplifiable()) {
                    try {
                        Fraction simp = f.getProblem33SimplifiedForm();
                        Fraction simpReduced = simp.reduce();

                        if(f.reduce().equals(simpReduced)) {
                            logger.info("this: " + f);
                        }
                    } catch (IllegalArgumentException e) {
                        ;
                    }
                }
            }
        }
    }



}


