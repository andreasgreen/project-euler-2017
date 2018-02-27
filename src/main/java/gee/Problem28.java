package gee;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.logging.Logger;


public class Problem28 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {

        int size = 1001;
        assert (size % 2) == 1;

        int number = 1;
        int numberOfLayers = size/2 + 1;

        logger.info("Size : " + size + " layers " + numberOfLayers);

        long totDiagonal = number;
        int nrSteps = 1;
        int factor = 2;

        for (int i = 1; i < numberOfLayers; i++) {
            for(int nrCorners = 0 ; nrCorners < 4 ; nrCorners++) {
                // find four corners
                number += nrSteps * factor;
                totDiagonal += number;
                //logger.info("tot: " + totDiagonal + " number " + number + " nr steps" + nrSteps );
            }
            nrSteps++;
        }

        logger.info("Tot diagonal sum " + totDiagonal);

    }
}
