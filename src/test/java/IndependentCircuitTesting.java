import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class IndependentCircuitTesting {

    private List<Integer> resultList;

    @Test
    void kLessThanZero() {
        // circuit covered: 1, 2, 1
        try {
            resultList = Main.findPrimes(-1, 1, 1000, 5);
            Assertions.fail("K should be negative.");
        }
        catch (IllegalArgumentException e) {
            Assertions.assertEquals("K is negative.", e.getMessage());
        }
    }

    @Test
    void sLessThanZero() {
        // circuit covered: 1, 3, 4, 1
        try {
            resultList = Main.findPrimes(5, 1, 1000, -5);
            Assertions.fail("S should be negative.");
        }
        catch (IllegalArgumentException e) {
            Assertions.assertEquals("S is negative.", e.getMessage());
        }
    }

    @Test
    void aOrBLessThanZero() {
        // circuit covered: 1, 3, 5, 6, 1
        try {
            resultList = Main.findPrimes(5, -1, -1000, 5);
            Assertions.fail("Range should be negative.");
        }
        catch (IllegalArgumentException e) {
            Assertions.assertEquals("Range is negative.", e.getMessage());
        }
    }

    @Test
    void aGreaterThanB() {
        // circuit covered: 1, 3, 5, 7, 8, 1
        try {
            resultList = Main.findPrimes(5, 1000, 1, 5);
            Assertions.fail("Range should be reversed.");
        }
        catch (IllegalArgumentException e) {
            Assertions.assertEquals("Range is reversed.", e.getMessage());
        }
    }

    @Test
    void findPrimesWithoutException() {
        // circuit covered from the beginning:
        // 1, 3, 5, 7, 9...14, 15, 35, 1
        // for number = 1 the covered circuit is:
        // 15, 16, 17, 15
        // for number = 2 or 3 the covered circuits are:
        // 15, 16, 18, 19, 23, 24...25, 26, 31, 33, 34, 15
        // 26, 27...29, 30, 26
        // for number = 4 the covered circuits are:
        // 15, 16, 18, 19, 23, 34, 15
        // 19, 20, 21, 22, 19
        // for number = 5 the covered circuits are:
        // 15, 16, 18, 19, 23, 24...25, 26, 31, 32, 33, 34, 15
        // 19, 20, 22, 19
        // 26, 27...29, 30, 26
        try {
            List<Integer> expectedList = new ArrayList<>(List.of(5));
            Assertions.assertEquals(expectedList, Main.findPrimes(1, 1, 500, 5));
        } catch (IllegalArgumentException e) {
            Assertions.fail("Exception: " + e.getMessage());
        }
    }
}
