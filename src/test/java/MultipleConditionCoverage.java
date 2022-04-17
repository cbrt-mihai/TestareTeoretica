import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleConditionCoverage {
    private List<Integer> expectedList;
    private List<Integer> resultList;
    private String expectedErrorMessage;

    @Test
    void kLessThanZeroTrue() {
        try {
            resultList = Main.findPrimes(-1, 0, 0, -1);
            Assertions.fail("K should be negative.");
        }
        catch (IllegalArgumentException e) {
            expectedErrorMessage = "K is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void kLessThanZeroFalse() {
        try {
            resultList = Main.findPrimes(1, 0, 0, -1);
            Assertions.fail("S should be negative.");
        }
        catch (Exception e) {
            expectedErrorMessage = "S is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void sLessThanZeroTrue() {
        try {
            resultList = Main.findPrimes(1, 0, 0, -1);
            Assertions.fail("S should be negative.");
        }
        catch (IllegalArgumentException e) {
            expectedErrorMessage = "S is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void sLessThanZeroFalse() {
        try {
            resultList = Main.findPrimes(1, -1, 0, 1);
            Assertions.fail("Range should be negative.");
        }
        catch (Exception e) {
            expectedErrorMessage = "Range is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void aLessThanZeroOrBLessThanZeroTrueTrue() {
        try {
            resultList = Main.findPrimes(1, -1, -1, 1);
            Assertions.fail("Range should be negative.");
        }
        catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void aLessThanZeroOrBLessThanZeroTrueFalse() {
        try {
            resultList = Main.findPrimes(1, -1, 0, 1);
            Assertions.fail("Range should be negative.");
        }
        catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void aLessThanZeroOrBLessThanZeroFalseTrue() {
        try {
            resultList = Main.findPrimes(1, 0, -1, 1);
            Assertions.fail("Range should be negative.");
        }
        catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void aLessThanZeroOrBLessThanZeroFalseFalse() {
        try {
            resultList = Main.findPrimes(1, 1, 0, 1);
            Assertions.fail("Range should be reversed.");
        }
        catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is reversed.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void aGreaterThanBTrue() {
        try {
            resultList = Main.findPrimes(1, 1, 0, 1);
            Assertions.fail("Range should be reversed.");
        }
        catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is reversed.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void aGreaterThanBFalse() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 0, 0, 1);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void primesSizeLessThanKAndNumberLessThanBTrueTrue() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(2));
            resultList = Main.findPrimes(1, 1, 2, 2);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void primesSizeLessThanKAndNumberLessThanBTrueFalse() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 1, 1, 1);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void primesSizeLessThanKAndNumberLessThanBFalseTrue() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(0, 1, 1, 1);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void primesSizeLessThanKAndNumberLessThanBFalseFalse() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(2));
            resultList = Main.findPrimes(1, 1, 2, 2);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void numberEqualsOneTrue() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 1, 2, 1);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void numberEqualsOneFalse() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(2));
            resultList = Main.findPrimes(1, 2, 2, 2);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }
}
