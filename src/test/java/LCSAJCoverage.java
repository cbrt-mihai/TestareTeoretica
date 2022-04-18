import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LCSAJCoverage {

    private List<Integer> expectedList;
    private List<Integer> resultList;

    @Test
    void t1Test(){
        // t1 covers LCSAJ 1
        try {
            resultList = Main.findPrimes(-1, 1, 500, 5);
            Assertions.fail("K should be negative.");
        }
        catch (IllegalArgumentException e) {
            Assertions.assertEquals("K is negative.", e.getMessage());
        }
    }

    @Test
    void t2Test(){
        // t2 covers LCSAJ 2
        try {
            resultList = Main.findPrimes(5, 1, 500, -5);
            Assertions.fail("S should be negative.");
        }
        catch (IllegalArgumentException e) {
            Assertions.assertEquals("S is negative.", e.getMessage());
        }
    }

    @Test
    void t3Test(){
        // t3 covers LCSAJ 3
        try {
            resultList = Main.findPrimes(5, -1, 500, 5);
            Assertions.fail("Range should be negative.");
        }
        catch (IllegalArgumentException e) {
            Assertions.assertEquals("Range is negative.", e.getMessage());
        }
    }

    @Test
    void t4Test(){
        // t4 covers LCSAJ 4
        try {
            resultList = Main.findPrimes(5, 500, 1, 5);
            Assertions.fail("Range should be reversed.");
        }
        catch (IllegalArgumentException e) {
            Assertions.assertEquals("Range is reversed.", e.getMessage());
        }
    }

    @Test
    void t5Test(){
        // t5 covers LCSAJ 5 and 21
        try {
            expectedList = new ArrayList<>();
            Assertions.assertEquals(expectedList, Main.findPrimes(0, 1, 500, 5));
        } catch (IllegalArgumentException e) {
            Assertions.fail("Exception: " + e.getMessage());
        }
    }

    @Test
    void t6Test(){
        // t6 covers LCSAJ 7, 10, 12, 13, 14, 17, 18, 19, 20, 21
        try {
            expectedList = new ArrayList<>(List.of(5));
            Assertions.assertEquals(expectedList, Main.findPrimes(1, 2, 500, 5));
        } catch (IllegalArgumentException e) {
            Assertions.fail("Exception: " + e.getMessage());
        }
    }

    @Test
    void t7Test(){
        // t7 covers LCSAJ 8, 10, 14, 17, 19, 21
        try {
            expectedList = new ArrayList<>(List.of(5));
            Assertions.assertEquals(expectedList, Main.findPrimes(1, 5, 500, 5));
        } catch (IllegalArgumentException e) {
            Assertions.fail("Exception: " + e.getMessage());
        }
    }

    @Test
    void t8Test(){
        // t8 covers LCSAJ 9, 10, 14, 15, 16, 17, 19, 21
        try {
            expectedList = new ArrayList<>();
            Assertions.assertEquals(expectedList, Main.findPrimes(1, 18, 18, 5));
        } catch (IllegalArgumentException e) {
            Assertions.fail("Exception: " + e.getMessage());
        }
    }

    @Test
    void t9Test(){
        // t9 covers LCSAJ 6, 10, 11, 21
        try {
            expectedList = new ArrayList<>();
            Assertions.assertEquals(expectedList, Main.findPrimes(1, 0, 1, 5));
        } catch (IllegalArgumentException e) {
            Assertions.fail("Exception: " + e.getMessage());
        }
    }

}
