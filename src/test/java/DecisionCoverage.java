import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DecisionCoverage {

	@Test // 1 T
	void kIsNegative() {
		try {
			Main.findPrimes(-1, 0, 0, 0);
			Assertions.fail("K should be positive.");
		}
		catch (Exception e) {
			String expectedErrorMessage = "K is negative.";
			Assertions.assertEquals(expectedErrorMessage, e.getMessage());
		}
	}

	@Test // 1 F, 2 T
	void sIsNegative() {
		try {
			Main.findPrimes(0, 0, 0, -1);
			Assertions.fail("S should be positive.");
		}
		catch (Exception e) {
			String expectedErrorMessage = "S is negative.";
			Assertions.assertEquals(expectedErrorMessage, e.getMessage());
		}
	}

	@Test // 2 F, 3 T
	void aOrBIsNegative() {
		try {
			Main.findPrimes(0, -1, 0, 0);
			Assertions.fail("Range should be positive.");
		}
		catch (Exception e) {
			String expectedErrorMessage = "Range is negative.";
			Assertions.assertEquals(expectedErrorMessage, e.getMessage());
		}
	}

	@Test // 3 F, 4 T
	void aGreaterThanB() {
		try {
			Main.findPrimes(0, 2, 1, 0);
			Assertions.fail("B should be greater than A.");
		}
		catch (Exception e) {
			String expectedErrorMessage = "Range is reversed.";
			Assertions.assertEquals(expectedErrorMessage, e.getMessage());
		}
	}

	@Test // 4 F, 5 T, 5 F, 6 T, 6 F, 7 F, 9 T, 10 T, 10 F, 11 T
	void test1() {
		try {
			List<Integer> expectedResut = Main.findPrimes(1, 1, 3, 2);
			Assertions.assertEquals(List.of(2),expectedResut);
		}
		catch (Exception e) {
			Assertions.fail(e.getMessage());
		}
	}

	@Test //  7 A, 8 A, 8 F, 9 F, 11 F
	void test2() {
		try {
			List<Integer> expectedResut = Main.findPrimes(5, 1, 5, 2);
			Assertions.assertEquals(List.of(2),expectedResut);
		}
		catch (Exception e) {
			Assertions.fail(e.getMessage());
		}
	}

}
