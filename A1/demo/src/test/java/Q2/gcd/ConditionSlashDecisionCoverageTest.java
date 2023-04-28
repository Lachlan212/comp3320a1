package Q2.gcd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gcd.BigInteger;

class ConditionSlashDecisionCoverageTest {

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
		BigInteger x = new BigInteger("-2147483648");
		BigInteger y = new BigInteger("-2147483648");
		BigInteger result;
		result = x.gcd(y);
		assertEquals(new BigInteger("2147483648"), result);
	}
	
	@Test
	void testCaseThree() {
		BigInteger x = new BigInteger("-2147483648");
		BigInteger y = new BigInteger("0");
		BigInteger result;
		result = x.gcd(y);
		assertEquals(new BigInteger("2147483648"), result);
	}
	
	@Test
	void testCaseFour() {
		BigInteger x = new BigInteger("12345678987654321");
		BigInteger y = new BigInteger("5");
		BigInteger result;
		result = x.gcd(y);
		assertEquals(new BigInteger("1"), result);
	}
	
	@Test
	void testCaseFive() {
		BigInteger x = new BigInteger("6");
		BigInteger y = new BigInteger("8");
		BigInteger result;
		result = x.gcd(y);
		assertEquals(new BigInteger("2"), result);
	}
	
	@Test
	void testCaseSix() {
		BigInteger x = new BigInteger("12345678987654321");
		BigInteger y = new BigInteger("98765432123456789");
		BigInteger result;
		result = x.gcd(y);
		assertEquals(new BigInteger("1"), result);
	}
	
	@Test
	void testCaseSeven() {
		BigInteger x = new BigInteger("24");
		BigInteger y = new BigInteger("12345678987654321");
		BigInteger result;
		result = x.gcd(y);
		assertEquals(new BigInteger("3"), result);
	}
}
