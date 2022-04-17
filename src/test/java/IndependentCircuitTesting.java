import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class IndependentCircuitTesting {

    private List<Integer> expectedList;

    @Test
    void kLessThanZero() {
        // circuit covered 1, 2, 1
        try {
            expectedList = new ArrayList<>();
            Assertions.assertEquals(expectedList, Main.findPrimes(-1, 1, 1000, 5));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(new IllegalArgumentException("K is negative.").toString(), e.toString());
        }
    }

    @Test
    void sLessThanZero() {
        // circuit covered 1, 3, 4, 1
        try {
            expectedList = new ArrayList<>();
            Assertions.assertEquals(expectedList, Main.findPrimes(5, 1, 1000, -5));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(new IllegalArgumentException("S is negative.").toString(), e.toString());
        }
    }

    @Test
    void aOrBLessThanZero() {
        // circuit covered 1, 3, 5, 6, 1
        try {
            expectedList = new ArrayList<>();
            Assertions.assertEquals(expectedList, Main.findPrimes(5, -1, -1000, 5));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(new IllegalArgumentException("Range is negative.").toString(), e.toString());
        }
    }

    @Test
    void aGreaterThanB() {
        // circuit covered 1, 3, 5, 7, 8, 1
        try {
            expectedList = new ArrayList<>();
            Assertions.assertEquals(expectedList, Main.findPrimes(5, 500, 1, 5));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(new IllegalArgumentException("Range is reversed.").toString(), e.toString());
        }
    }

    @Test
    void findPrimesWithoutException() {
        // circuit covered from the beginning: 1, 3, 5, 7, 9...14, 15, 35, 1
        // for number = 1 the covered circuit is: 15, 16, 17, 15
        // for number = 2 or 3 the covered circuits are: 15, 16, 18, 19, 23, 24...25, 26, 30, 31, 33, 34, 15 and 26, 27...29, 26
        // for number = 4 the covered circuits are: 15, 16, 18, 19, 23, 34, 15 and  19, 20, 21, 22, 19
        // for number 5 the covered circuits are: 15, 16, 18, 19, 23, 24...25, 26, 30, 31, 32, 33, 34, 15 and  19, 20, 22, 19
        // and 26, 27...29, 26
        try {
            expectedList = new ArrayList<>(List.of(5));
            Assertions.assertEquals(expectedList, Main.findPrimes(1, 1, 500, 5));
        } catch (IllegalArgumentException e) {
            Assertions.fail("Exception: " + e.getMessage());
        }
    }
}
