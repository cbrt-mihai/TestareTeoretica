import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.*;

import java.util.ArrayList;


public class tests {
    @Test
    void testBlackboxClasses() {
        Assertions.assertEquals(3, Main.findPrimes(1,1,10,3));
    }
}
