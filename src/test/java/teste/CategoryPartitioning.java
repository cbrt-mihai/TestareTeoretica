package teste;

import cod.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CategoryPartitioning {
    private List<Integer> expectedList;
    private List<Integer> resultList;
    private String expectedErrorMessage;

    @Test
    void k1() {
        try {
            resultList = Main.findPrimes(-1, 0, 0, 0);
            Assertions.fail("K should be negative.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "K is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k2() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(0, 0, 0, 0);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a1() {
        try {
            resultList = Main.findPrimes(1, -1, 0, 0);
            Assertions.fail("Range should be negative.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a2b1() {
        try {
            resultList = Main.findPrimes(1, 0, -1, 0);
            Assertions.fail("Range should be negative.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a2b2() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 0, 0, 0);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a2b3() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 0, 1, 0);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a2b6s1() {
        try {
            resultList = Main.findPrimes(1, 0, 4, -1);
            Assertions.fail("S should be negative.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "S is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a2b6s2() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 0, 4, 0);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a2b6s3nab2ns1() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 0, 9, 17);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a2b6s3nab2ns2() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(2));
            resultList = Main.findPrimes(1, 0, 14, 2);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a2b8s1() {
        try {
            resultList = Main.findPrimes(1, 0, 3, -1);
            Assertions.fail("S should be negative.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "S is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a2b8s2() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 0, 3, 0);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a2b8s3nab2ns1() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 0, 7, 17);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a2b8s3nab2ns2() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(7));
            resultList = Main.findPrimes(1, 0, 7, 7);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a3b1() {
        try {
            resultList = Main.findPrimes(1, 1, -1, 0);
            Assertions.fail("Range should be negative.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a3b2() {
        try {
            resultList = Main.findPrimes(1, 1, 0, 0);
            Assertions.fail("Range should be reversed.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is reversed.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a3b3() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 1, 1, 1);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a3b6s1() {
        try {
            resultList = Main.findPrimes(1, 1, 2, -1);
            Assertions.fail("S should be negative.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "S is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a3b6s2() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 1, 2, 0);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a3b6s3nab2ns1() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 1, 9, 17);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a3b6s3nab2ns2() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(2, 11));
            resultList = Main.findPrimes(2, 1, 14, 2);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a3b8s1() {
        try {
            resultList = Main.findPrimes(3, 1, 3, -1);
            Assertions.fail("S should be negative.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "S is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a3b8s2() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(5, 1, 3, 0);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a3b8s3nab2ns1() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(2, 1, 7, 17);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a3b8s3nab2ns2() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(7));
            resultList = Main.findPrimes(3, 1, 7, 7);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a4b1() {
        try {
            resultList = Main.findPrimes(3, 4, -1, 0);
            Assertions.fail("Range should be negative.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a4b2 () {
        try {
            resultList = Main.findPrimes(4, 4, 0, 0);
            Assertions.fail("Range should be reversed.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is reversed.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a4b3() {
        try {
            resultList = Main.findPrimes(2, 4, 1, 0);
            Assertions.fail("Range should be reversed.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is reversed.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a4b4() {
        try {
            resultList = Main.findPrimes(8, 4, 2, 0);
            Assertions.fail("Range should be reversed.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is reversed.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a4b5s1() {
        try {
            resultList = Main.findPrimes(1, 4, 4, -1);
            Assertions.fail("S should be negative.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "S is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a4b5s2() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(9, 4, 4, 0);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a4b5s3nab1ns1() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(3, 4, 4, 5);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a4b5s3nab1ns2() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(5, 4, 4, 4);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a4b6s1() {
        try {
            resultList = Main.findPrimes(6, 24, 28, -1);
            Assertions.fail("S should be negative.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "S is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a4b6s2() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(2, 24, 28, 0);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a4b6s3nab1ns1() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 24, 28, 19);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a4b6s3nab1ns2() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(4, 24, 28, 9);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a4b6s3nab2ns1() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(8, 27, 30, 19);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a4b6s3nab2ns2() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(29));
            resultList = Main.findPrimes(11, 27, 30, 11);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a4b8s1() {
        try {
            resultList = Main.findPrimes(3, 4, 5, -1);
            Assertions.fail("S should be negative.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "S is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a4b8s2() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(3, 4, 5, 0);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a4b8s3nab2ns1() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(10, 24, 29, 100);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a4b8s3nab2ns2() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(29));
            resultList = Main.findPrimes(8, 24, 29, 11);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a5b1() {
        try {
            resultList = Main.findPrimes(8, 3, -1, 0);
            Assertions.fail("Range should be negative.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a5b2() {
        try {
            resultList = Main.findPrimes(7, 3, 0, 0);
            Assertions.fail("Range should be reversed.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is reversed.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a5b3() {
        try {
            resultList = Main.findPrimes(6, 3, 1, 0);
            Assertions.fail("Range should be reversed.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is reversed.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a5b4() {
        try {
            resultList = Main.findPrimes(4, 3, 2, 0);
            Assertions.fail("Range should be reversed.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "Range is reversed.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a5b6s1() {
        try {
            resultList = Main.findPrimes(5, 23, 28, -1);
            Assertions.fail("S should be negative.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "S is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a5b6s2() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(2, 23, 28, 0);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a5b6s3nab2ns1() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(10, 23, 27, 19);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a5b6s3nab2ns2() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(23));
            resultList = Main.findPrimes(16, 23, 27, 5);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a5b7s1() {
        try {
            resultList = Main.findPrimes(9, 23, 23, -1);
            Assertions.fail("S should be negative.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "S is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a5b7s2() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(3, 23, 23, 0);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a5b7s3nab2ns1() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(1, 23, 23, 19);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a5b7s3nab2ns2() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(23));
            resultList = Main.findPrimes(4, 23, 23, 5);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a5b8s1() {
        try {
            resultList = Main.findPrimes(2, 3, 5, -1);
            Assertions.fail("S should be negative.");
        } catch (IllegalArgumentException e) {
            expectedErrorMessage = "S is negative.";
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        }
    }

    @Test
    void k3a5b8s2() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(6, 3, 5, 0);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a5b8s3nab2ns1() {
        try {
            expectedList = new ArrayList<>();
            resultList = Main.findPrimes(5, 23, 29, 100);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }

    @Test
    void k3a5b8s3nab2ns2() {
        try {
            expectedList = new ArrayList<>(Arrays.asList(29));
            resultList = Main.findPrimes(8, 23, 29, 11);
            Assertions.assertEquals(expectedList, resultList);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Encountered exception: " + e.getMessage());
        }
    }
}
