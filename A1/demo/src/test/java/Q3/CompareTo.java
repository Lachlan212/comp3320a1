package Q3;
import java.math.BigInteger;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CompareTo {
    

    //Testing for All-Defs coverage
    @Test
    public void testDefsLessThan(){
        BigInteger X = new BigInteger("239800576930487596623453462", 10);
        BigInteger Y = new BigInteger("4085792071597977564636334666", 10);
        assertEquals(-1, X.compareTo(Y));
    }

    @Test
    public void testDefsGreaterThan(){
        BigInteger Y = new BigInteger("239800576930487596623453462", 10);
        BigInteger X = new BigInteger("4085792071597977564636334666", 10);
        assertEquals(1, X.compareTo(Y));
    }

    @Test
    public void testDefsEqualTo(){
        BigInteger X = new BigInteger("4085792071597977564636334666", 10);
        BigInteger Y = new BigInteger("4085792071597977564636334666", 10);
        assertEquals(0, X.compareTo(Y));
    }

    //Testing for All-Uses coverage

    @Test
    public void testUsesNode2Equal(){
        BigInteger X = BigInteger.ONE;
        BigInteger Y = BigInteger.ONE;
        assertEquals(0, X.compareTo(Y));
    }

    @Test
    public void testUsesNode2LessThan(){
        BigInteger X = BigInteger.ONE;
        BigInteger Y = BigInteger.TWO;
        assertEquals(-1, X.compareTo(Y));
    }

    @Test
    public void testUsesNode2GreaterThan(){
        BigInteger X = BigInteger.TWO;
        BigInteger Y = BigInteger.ONE;
        assertEquals(1, X.compareTo(Y));
    }

    @Test
    public void testUsesNode5GreaterThan(){
        BigInteger X = new BigInteger("239800576930487596623453462", 10);
        BigInteger Y = new BigInteger("-4085792071597977564636334666", 10);
        assertEquals(1, X.compareTo(Y));
    }

    @Test
    public void testUsesNode5LessThan(){
        BigInteger Y = new BigInteger("239800576930487596623453462", 10);
        BigInteger X = new BigInteger("-4085792071597977564636334666", 10);
        assertEquals(-1, X.compareTo(Y));
    }

    @Test
    public void testUsesNode9LessThan(){
        BigInteger X = new BigInteger("4085792071597977564636334665", 10);
        BigInteger Y = new BigInteger("4085792071597977564636334666", 10);
        assertEquals(-1, X.compareTo(Y));
    }

    @Test
    public void testUsesNode9GreaterThan(){
        BigInteger X = new BigInteger("4085792071597977564636334667", 10);
        BigInteger Y = new BigInteger("4085792071597977564636334666", 10);
        assertEquals(1, X.compareTo(Y));
    }

}
