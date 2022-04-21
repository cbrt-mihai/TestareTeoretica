package teste;

import cod.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StatementCoverage {
    @Test
    void kLessThanZero() {
        List expectedList;

        // K < 0
        try {
            expectedList = new ArrayList(Arrays.asList());
            Assertions.assertEquals(expectedList, Main.findPrimes(-3, 1, 20, 3));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(new IllegalArgumentException("K is negative.").toString(), e.toString());
        }
    }

    @Test
    void aGreaterThanB() {
        List expectedList;

        // a > b
        try {
            expectedList = new ArrayList(Arrays.asList());
            Assertions.assertEquals(expectedList, Main.findPrimes(3, 20, 1, 3));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(new IllegalArgumentException("Range is reversed.").toString(), e.toString());
        }
    }

    @Test
    void sLessThanZero() {
        List expectedList;

        // S < 0
        try {
            expectedList = new ArrayList(Arrays.asList());
            Assertions.assertEquals(expectedList, Main.findPrimes(3, 1, 20, -5));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(new IllegalArgumentException("S is negative.").toString(), e.toString());
        }
    }

    @Test
    void aOrBLessThanZero() {
        List expectedList;

        // a < 0 or b < 0
        try {
            expectedList = new ArrayList(Arrays.asList());
            Assertions.assertEquals(expectedList, Main.findPrimes(3, -5, 1, 3));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(new IllegalArgumentException("Range is negative.").toString(), e.toString());
        }
    }

    @Test
    void goodFindPrimes() {
        List expectedList;

        // Good
        try {
            expectedList = new ArrayList(Arrays.asList(5));
            Assertions.assertEquals(expectedList, Main.findPrimes(1, 1, 5, 5));
        }
        catch (IllegalArgumentException e) {
            Assertions.assertEquals(new IllegalArgumentException("Range is negative.").toString(), e.toString());
        }
    }
}
