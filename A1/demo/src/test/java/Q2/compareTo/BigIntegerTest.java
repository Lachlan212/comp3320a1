package Q2.compareTo;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.math.BigInteger;

public class BigIntegerTest {

    @Test
    public void testStatementCoverage() {
        assertEquals(-1, new BigInteger("2").compareTo(new BigInteger("4")));
        assertEquals(0, new BigInteger("5").compareTo(new BigInteger("5")));
        assertEquals(-1, new BigInteger("-98765432109876543210").compareTo(new BigInteger("98765432109876543211")));
        assertEquals(1, new BigInteger("123456789012345678901234").compareTo(new BigInteger("12345678901234567890")));
    }

    @Test
    public void testBranchDecisionCoverage() {
        assertEquals(-1, new BigInteger("2").compareTo(new BigInteger("4")));
        assertEquals(1, new BigInteger("4").compareTo(new BigInteger("2")));
        assertEquals(0, new BigInteger("5").compareTo(new BigInteger("5")));
        assertEquals(-1, new BigInteger("-98765432109876543210").compareTo(new BigInteger("98765432109876543211")));
        assertEquals(1, new BigInteger("98765432109876543211").compareTo(new BigInteger("-98765432109876543210")));
        assertEquals(1, new BigInteger("123456789012345678901234").compareTo(new BigInteger("12345678901234567890")));
        assertEquals(-1, new BigInteger("12345678901234567890").compareTo(new BigInteger("123456789012345678901234")));
    }

    @Test
    public void testConditionCoverage() {
        assertEquals(-1, new BigInteger("2").compareTo(new BigInteger("4")));
        assertEquals(1, new BigInteger("4").compareTo(new BigInteger("2")));
        assertEquals(-1, new BigInteger("-98765432109876543210").compareTo(new BigInteger("98765432109876543211")));
        assertEquals(1, new BigInteger("98765432109876543211").compareTo(new BigInteger("-98765432109876543210")));
        assertEquals(-1, new BigInteger("12345678901234567890").compareTo(new BigInteger("123456789012345678901234")));
    }

    @Test
    public void testConditionDecisionCoverage() {
        assertEquals(-1, new BigInteger("2").compareTo(new BigInteger("4")));
        assertEquals(1, new BigInteger("4").compareTo(new BigInteger("2")));
        assertEquals(0, new BigInteger("5").compareTo(new BigInteger("5")));
        assertEquals(-1, new BigInteger("-98765432109876543210").compareTo(new BigInteger("98765432109876543211")));
        assertEquals(1, new BigInteger("98765432109876543211").compareTo(new BigInteger("-98765432109876543210")));
        assertEquals(1, new BigInteger("123456789012345678901234").compareTo(new BigInteger("12345678901234567890")));
        assertEquals(-1, new BigInteger("12345678901234567890").compareTo(new BigInteger("123456789012345678901234")));
    }

    @Test
    public void testMultipleConditionCoverage() {
        assertEquals(-1, new BigInteger("2").compareTo(new BigInteger("4")));
        assertEquals(1, new BigInteger("4").compareTo(new BigInteger("2")));
        assertEquals(0, new BigInteger("5").compareTo(new BigInteger("5")));
        assertEquals(-1, new BigInteger("-98765432109876543210").compareTo(new BigInteger("98765432109876543211")));
        assertEquals(1, new BigInteger("98765432109876543211").compareTo(new BigInteger("-98765432109876543210")));
        assertEquals(1, new BigInteger("123456789012345678901234").compareTo(new BigInteger("12345678901234567890")));
        assertEquals(-1, new BigInteger("12345678901234567890").compareTo(new BigInteger("123456789012345678901234")));
    }
}