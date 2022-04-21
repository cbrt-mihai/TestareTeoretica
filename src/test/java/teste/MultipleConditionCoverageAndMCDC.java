package teste;

import cod.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleConditionCoverageAndMCDC {
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
    void numberEqualsZeroOrOneTrueFalse() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 0, 2, 1);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void numberEqualsZeroOrOneFalseTrue() {
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
    void numberEqualsZeroOrOneFalseFalse() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(2));
            resultList = Main.findPrimes(1, 2, 2, 2);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void notFoundAndDivisorLessThanSqrtNumberTrueTrue() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 4, 4, 4);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void notFoundAndDivisorLessThanSqrtNumberTrueFalse() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(2));
            resultList = Main.findPrimes(1, 2, 2, 2);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void notFoundAndDivisorLessThanSqrtNumberFalseFalse() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 12, 12, 3);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void notFoundAndDivisorLessThanSqrtNumberFalseTrue() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 9, 9, 9);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void numberModDivisorTrue() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 4, 4, 4);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void numberModDivisorFalse() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 9, 9, 9);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void notFoundTrue() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(3));
            resultList = Main.findPrimes(1, 3, 3, 3);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void notFoundFalse() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 4, 4, 4);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void copyNotZeroTrue() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(3));
            resultList = Main.findPrimes(1, 3, 3, 3);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void copyNotZeroFalse() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(5));
            resultList = Main.findPrimes(1, 5, 5, 5);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void sumEqualsSTrue() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(7));
            resultList = Main.findPrimes(1, 7, 7, 7);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void sumEqualsSFalse() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 7, 7, 9);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }


}
