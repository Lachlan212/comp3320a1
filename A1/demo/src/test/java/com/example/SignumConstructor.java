package com.example;
import java.math.BigInteger;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SignumConstructor{

    //For all of these cases, a failed test will either result in a null object, rather than a BigInteger, or a NumberFormatException is thrown.
    //Because of this, if the catch(NumberFormatException e) is met, the test has automatically failed. assertFalse(true) will automatically fail a test


    @Test
    public void SignumLowerBoundLimit(){
        try{
            byte[] X = {1,2,3,4,5};
            int signum = -2;
            BigInteger testVal = new BigInteger(signum, X);
            assertNotNull(testVal);
        }
        catch(NumberFormatException e){
            assertFalse(true);
        }
        
    }

    @Test
    public void SignumNegative1(){
        try{
            byte[] X = {1,2,3,4,5};
            int signum = -1;
            BigInteger testVal = new BigInteger(signum, X);
            assertNotNull(testVal);
        }
        catch(NumberFormatException e){
            assertFalse(true);
        }
    }

    @Test
    public void SignumPositive1(){
        try{
            byte[] X = {1,2,3,4,5};
            int signum = 1;
            BigInteger testVal = new BigInteger(signum, X);
            assertNotNull(testVal);
        }
        catch(NumberFormatException e){
            assertFalse(true);
        }
        
    }

    @Test
    public void SignumUpperBoundLimit(){
        try{
            byte[] X = {1,2,3,4,5};
            int signum = 2;
            BigInteger testVal = new BigInteger(signum, X);
            assertNotNull(testVal);
        }
        catch(NumberFormatException e){
            assertFalse(true);
        }
       
    }

    @Test
    public void Signum0InvalidMag(){
        try{
            byte[] X = {1,2,3,4,5};
            int signum = 0;
            BigInteger testVal = new BigInteger(signum, X);
            assertNotNull(testVal);
        }
        catch(NumberFormatException e){
            assertFalse(true);
        }
    }

    @Test
    public void Signum0ValidMag(){
        try{
            byte[] X = {0};
            int signum = 0;
            BigInteger testVal = new BigInteger(signum, X);
            assertNotNull(testVal);
        }
        catch(NumberFormatException e){
            assertFalse(true);
        }
    }

    @Test
    public void SignumNonZeroWithZeroMag(){
        try{
            byte[] X = {0};
            int signum = 1;
            BigInteger testVal = new BigInteger(signum, X);
            assertNotNull(testVal);
        }
        catch(NumberFormatException e){
            assertFalse(true);
        }
    }



}

