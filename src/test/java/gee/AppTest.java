package gee;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class AppTest {

    @org.junit.Test
    public void testIsPrime() {
        assertTrue(Common.isPrime(6700417));
        assertTrue(Common.isPrime(67280421310721L));
        assertFalse(Common.isPrime(105));
        assertFalse(Common.isPrime(12381));
        assertTrue(Common.isPrime(1999993L));
    }

    @org.junit.Test
    public void testIsEven() {
        assertTrue(Common.isEven(123456));
        assertFalse(Common.isEven(1234567));


    }

}
