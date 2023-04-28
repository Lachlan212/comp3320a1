package Q1;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Created by Lachlan Higgins (c3374994), for SENG3320 Assignment 1
public class CompareToTest {
    
    
    @Test
    public void testCaseYLessThanXTrue(){ //X<Y
        BigInteger X = new BigInteger("10", 10);
        BigInteger Y = BigInteger.ONE;
        assertEquals(1, X.compareTo(Y));
    }

    @Test
    public void testCaseYLessThanXFalse(){ //X!<Y
        BigInteger X = BigInteger.ONE;
        BigInteger Y = new BigInteger("10", 10);
        assertNotEquals(1, X.compareTo(Y));
    }


    @Test
    public void testCaseEqualToTrue(){ //X==Y
        BigInteger X = BigInteger.ONE;
        BigInteger Y = BigInteger.ONE;
        assertEquals(0, X.compareTo(Y));
    }

    @Test
    public void testCaseEqualToFalse(){ //X!=Y
        BigInteger X = new BigInteger("10", 10);
        BigInteger Y = BigInteger.ONE;
        assertNotEquals(0, X.compareTo(Y));
    }

    @Test
    public void testCaseYGreaterThanXTrue(){ //X>Y
        BigInteger X = new BigInteger("10", 10);
        BigInteger Y = BigInteger.ONE;
        assertEquals(-1, Y.compareTo(X));
    }

    @Test
    public void testCaseYGreaterThanXFalse(){ //X!>Y
        BigInteger X = BigInteger.ONE;
        BigInteger Y = new BigInteger("10", 10);
        assertNotEquals(-1, Y.compareTo(X));
    }

}
