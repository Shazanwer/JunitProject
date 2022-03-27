package junits;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametersExample {

	@ParameterizedTest
	@ValueSource(strings = { "radar", "racecar", "shahs" })
	public void test1(String name) {

		assertTrue(StringFunctions.isPalindrome(name));
	}

	@ParameterizedTest
	@ValueSource(ints = { 4, 50, 6, 78 })
	public void test2(int num) {

		assertTrue(num % 2 == 0);
	}

	@ParameterizedTest
	@EnumSource(Month.class)
	public void test3(Month month) {

		int monthValue = month.getValue();
//		System.out.println(monthValue);
		assertTrue(monthValue <= 12);
	}

	@ParameterizedTest
	@EnumSource(value = Month.class, names =

	{ "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER" })

	public void test4(Month month) {

		assertEquals(30, month.length(true));
	}

	@ParameterizedTest
	@EnumSource(value = Month.class, names = { "FEBRUARY" })

	public void test5(Month month) {

		assertEquals(29, month.length(true));
	}

	@ParameterizedTest
	@MethodSource("DPMethod")
	public void test6(String name) {
		
		assertTrue(StringFunctions.isPalindrome(name));
	}

	public static Stream<String> DPMethod() {
		return Stream.of("radar", "MOM", "DAD", "racecar", "shah");
	}
}
