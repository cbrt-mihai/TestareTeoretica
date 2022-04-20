import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConditionDecisionCoverage {
    private List<Integer> expectedList;
    private List<Integer> resultList;
    private String expectedErrorMessage;

    @Test
    void kIsNegative() {
        try {
            resultList = Main.findPrimes(-5, 0, 0, 0);
            Assertions.fail("K should be negative.");
        }
        catch (IllegalArgumentException e) {
            expectedErrorMessage = "K is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void kIsNotNegative() {
        try {
            resultList = Main.findPrimes(5, 0, 0, -5);
            Assertions.fail("S should be negative.");
        }
        catch (Exception e) {
            expectedErrorMessage = "S is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void sIsNegative() {
        try {
            resultList = Main.findPrimes(5, 0, 0, -5);
            Assertions.fail("S should be negative.");
        }
        catch (IllegalArgumentException e) {
            expectedErrorMessage = "S is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void sIsNotNegative() {
        try {
            resultList = Main.findPrimes(1, -4, 5, 5);
            Assertions.fail("Range should be negative.");
        }
        catch (Exception e) {
            expectedErrorMessage = "Range is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void aIsNegativeandsbIsNegative() {
        try {
            resultList = Main.findPrimes(5, -5, -5, 5);
            Assertions.fail("Range should be negative.");
        }
        catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }



    @Test
    void aIsNotNegativeandsbIsNotNegative() {
        try {
            resultList = Main.findPrimes(5, 7, 5, 5);
            Assertions.fail("Range should be reversed.");
        }
        catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is reversed.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void aIsGreaterThanb() {
        try {
            resultList = Main.findPrimes(5, 5, 1, 1);
            Assertions.fail("Range should be reversed.");
        }
        catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is reversed.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void aIsNotGreaterThanb() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(5, 1, 5, 1);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }



    @Test
    void sizeLowerThankNumberHigherThanb() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 5, 5, 10);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void sizeHigherThankNumberLowerThanb() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(5, 1, 5, 1);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }


    @Test
    void numberIsZero() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(5, 0, 5, 7);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void numberIsOne() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(5, 1, 5, 7);
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
    void notFoundAndDivisorLessThanSqrtNumber() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(7));
            resultList = Main.findPrimes(5, 7, 9, 7);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }



    @Test
    void FoundAndDivisorHigherThanSqrtNumber() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(5, 6, 8, 6);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void numberModDivisorIsZero() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(5, 2, 9, 1);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void numberModDivisorIsNotZero() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 3, 7, 9);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void notFound() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(7));
            resultList = Main.findPrimes(1, 7, 9, 7);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void Found() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 6, 8, 6);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void copyNotZero() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(5));
            resultList = Main.findPrimes(1, 5, 7, 5);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void copyIsZero() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(5));
            resultList = Main.findPrimes(1, 5, 7, 5);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void sumEqualsS() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(5));
            resultList = Main.findPrimes(1, 5, 9, 5);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void sumNotEqualsS() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 5, 9, 9);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }
    //Condition/Decision coverage

    @Test
    void sizeLowerThankNumberLowerThanb() {
        try {
            expectedList = new ArrayList<>(Arrays.asList());
            resultList = Main.findPrimes(5, 1, 5, 1);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void sizeHigherThankNumberHigherThanb() {
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
    void numberNotZeroOrOne() {
        try {
            expectedList = new ArrayList<>(Arrays.asList());
            resultList = Main.findPrimes(1, 6, 8, 5);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void notFoundDivisorLessThanSqrtNumber() {
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
    void FoundAndDivisorHigherThanSqrtNumberFalseFalse() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 9, 9, 9);
            Assertions.assertEquals(expectedList, resultList);
        }
        catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }


}
