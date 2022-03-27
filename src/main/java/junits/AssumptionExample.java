package junits;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AssumptionExample {

	@BeforeAll
	public static void Setup() {

		System.setProperty("ENV", "DEV");

	}

	@Test
	public void test1() {
		
		assumeTrue("DEV".equals(System.getProperty("ENV")));
//		assumeFalse("DEV".equals(System.getProperty("ENV")));
		
		assertTrue(StringFunctions.isPalindrome("racecaR"));
		assertTrue(StringFunctions.isPalindrome("RADAR"));
	}

}
