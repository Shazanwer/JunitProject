package junits;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringFunctionTest {

	@CustomAnnotationForPositiveCases
	public void test1() {
		assertTrue(StringFunctions.isPalindrome("racecaR"));
		assertTrue(StringFunctions.isPalindrome("RADAR"));
	}

	@CustomAnnotationForNegativeCases
	public void test2() {

		assertFalse(StringFunctions.isPalindrome("SHAH"));
	}
}
