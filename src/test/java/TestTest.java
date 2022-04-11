import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestTest {
    @Test
    void simpleTest() {
        List expectedList;

        expectedList = new ArrayList(Arrays.asList(3));
        Assertions.assertEquals(expectedList, Main.findPrimes(3,1,20,3));

        expectedList = new ArrayList(Arrays.asList(13, 31));
        Assertions.assertEquals(expectedList, Main.findPrimes(5,1,100,4));

    }
}
