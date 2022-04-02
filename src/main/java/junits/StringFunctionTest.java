package junits;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;

public class StringFunctionTest {

	@Tag("Sanity")
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
