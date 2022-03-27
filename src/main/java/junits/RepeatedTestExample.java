package junits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestExample {
	
	@RepeatedTest(3)
	public void addTest1() {
		
		assertEquals(9,Calculator.add(4, 5));
	}

}
