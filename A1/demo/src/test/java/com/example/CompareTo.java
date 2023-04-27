package com.example;
import java.math.BigInteger;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CompareTo {
    
    

    @Test
    public void YLessThanXTrue(){ //X<Y
        BigInteger X = new BigInteger("10", 10);
        BigInteger Y = BigInteger.ONE;
        assertEquals(1, X.compareTo(Y));
    }

    @Test
    public void YLessThanXFalse(){ //X!<Y
        BigInteger X = BigInteger.ONE;
        BigInteger Y = new BigInteger("10", 10);
        assertNotEquals(1, X.compareTo(Y));
    }


    @Test
    public void EqualToTrue(){ //X==Y
        BigInteger X = BigInteger.ONE;
        BigInteger Y = BigInteger.ONE;
        assertEquals(0, X.compareTo(Y));
    }

    @Test
    public void EqualToFalse(){ //X!=Y
        BigInteger X = new BigInteger("10", 10);
        BigInteger Y = BigInteger.ONE;
        assertNotEquals(0, X.compareTo(Y));
    }

    @Test
    public void YGreaterThanXTrue(){ //X>Y
        BigInteger X = new BigInteger("10", 10);
        BigInteger Y = BigInteger.ONE;
        assertEquals(-1, Y.compareTo(X));
    }

    @Test
    public void YGreaterThanXFalse(){ //X!>Y
        BigInteger X = BigInteger.ONE;
        BigInteger Y = new BigInteger("10", 10);
        assertNotEquals(-1, Y.compareTo(X));
    }

}
