package Q3.gcd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;

class AllDefsCoverageTest {

	@Test
	void testCaseOne() {
		BigInteger x = new BigInteger("0");
		BigInteger y = new BigInteger("-5");
		BigInteger result;
		result = x.gcd(y);
		assertEquals(new BigInteger("5"), result);
	}
	
	@Test
	void testCaseTwo() {
		BigInteger x = new BigInteger("-6");
		BigInteger y = new BigInteger("-8");
		BigInteger result;
		result = x.gcd(y);
		assertEquals(new BigInteger("2"), result);
	}
	
	@Test
	void testCaseThree() {
		BigInteger x = new BigInteger("30");
		BigInteger y = new BigInteger("-2147483648");
		BigInteger result;
		result = x.gcd(y);
		assertEquals(new BigInteger("2"), result);
	}
}