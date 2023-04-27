package Q3;
import java.math.BigInteger;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CompareTo {
    

    //Testing for All-Defs coverage
    @Test
    public void testAllDefs(){
        BigInteger X = new BigInteger("239800576930487596623453462");
        BigInteger Y = new BigInteger("4085792071597977564636334666");
        assertEquals(-1, X.compareTo(Y));
    }

    

}
