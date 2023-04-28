package Q1;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Created by Lachlan Higgins (c3374994), for SENG3320 Assignment 1
public class StringConstructorTest {
    
    @Test
    public void LessThanGlobalMin(){
        try{
            String s = "010101";
            int radix = 1;
            BigInteger testVal = new BigInteger(s, radix);
            assertNotNull(testVal);
        }
        catch(NumberFormatException e){
            assertFalse(true);
        }
    }

    @Test
    public void EqualToGlobalMin(){
        try{
            String s = "010101";
            int radix = 2;
            BigInteger testVal = new BigInteger(s, radix);
            assertNotNull(testVal);
        }
        catch(NumberFormatException e){
            assertFalse(true);
        }
    }

    @Test
    public void LessThanLocalMin(){
        try{
            String s = "123ABC";
            int radix = 12;
            BigInteger testVal = new BigInteger(s, radix);
            assertNotNull(testVal);
        }
        catch(NumberFormatException e){
            assertFalse(true);
        }
    }

    @Test
    public void EqualToLocalMin(){
        try{
            String s = "123ABC";
            int radix = 13;
            BigInteger testVal = new BigInteger(s, radix);
            assertNotNull(testVal);
        }
        catch(NumberFormatException e){
            assertFalse(true);
        }
    }

    @Test
    public void BetweenMinMax(){
        try{
            String s = "123ABC";
            int radix = 24;
            BigInteger testVal = new BigInteger(s, radix);
            assertNotNull(testVal);
        }
        catch(NumberFormatException e){
            assertFalse(true);
        }
    }

    @Test
    public void EqualToMax(){
        try{
            String s = "123ABC";
            int radix = 36;
            BigInteger testVal = new BigInteger(s, radix);
            assertNotNull(testVal);
        }
        catch(NumberFormatException e){
            assertFalse(true);
        }
    }

    @Test
    public void GreaterThanMax(){
        try{
            String s = "123ABC";
            int radix = 37;
            BigInteger testVal = new BigInteger(s, radix);
            assertNotNull(testVal);
        }
        catch(NumberFormatException e){
            assertFalse(true);
        }
    }

}
