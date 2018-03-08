package gee;

import java.io.IOException;
import java.util.logging.Logger;


public class Problem46 {
    private static final Logger logger = Logger.getAnonymousLogger();


    public static void main(String[] args) throws IOException {
        boolean found = false;

        compositeLoop:
        for (long composite = 3; !found ; composite = composite + 2) {
            //logger.info("Looking at composite: " + composite);
            if(isComposite(composite)) {
                for (long prime = 1; prime < composite ; prime++) {
                    //logger.info("Looking at prime " + prime);
                    if(Common.isPrime(prime)) {
                        for (int base = 1 ; prime + 2*Math.pow(base,2) <= composite ; base++) {
                            long sum = (long) (prime + 2*Math.pow(base,2));
                            //logger.info("got sum " + sum + " for base " + base + " and comp  " + composite + " and prime " + prime);

                            if(sum == composite) {
                                continue compositeLoop;
                            }
                        }
                    }
                }

                // have exhausted all possibilities
                //logger.info("Comp: " + composite);
                logger.info("Ended all loops " + composite);
                found = true;
                break;
            } else {
                // just ignore
            }
        }


    }

    private static boolean isComposite(long i) {
        return !Common.isPrime(i);
    }

}
