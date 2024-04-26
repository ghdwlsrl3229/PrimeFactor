import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {
    @Test
    void testPrimefactorOf1() {
        PrimeFactor primefactor = new PrimeFactor();
        assertNotNull(primefactor);
    }
}