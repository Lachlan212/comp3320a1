package com.example;
import java.math.BigInteger;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CompareTo {
    
    

    @Test
    public void YLessThanX(){ //X<Y
        BigInteger X = new BigInteger("10", 10);
        BigInteger Y = BigInteger.ONE;
        assertEquals(1, X.compareTo(Y));
    }

    @Test
    public void EqualTo(){ //X<Y
        BigInteger X = BigInteger.ONE;
        BigInteger Y = BigInteger.ONE;
        assertEquals(0, X.compareTo(Y));
    }

    @Test
    public void YGreaterThanX(){ //X<Y
        BigInteger X = new BigInteger("10", 10);
        BigInteger Y = BigInteger.ONE;
        assertEquals(-1, Y.compareTo(X));
    }

}
