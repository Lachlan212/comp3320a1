package A2.Q1;

import org.junit.Test;

public class FuzzTestTool {
    
    FuzzGenTool FuzzGen = new FuzzGenTool();

    @Test
    public void testAlphaChar(){
        FuzzGen.inputFileGen(1);
    }

    @Test
    public void testNumChar(){
        FuzzGen.inputFileGen(2);
    }

    @Test
    public void testSpecialChar(){
        FuzzGen.inputFileGen(3);
    }

    @Test
    public void testAlphanumericChar(){
        FuzzGen.inputFileGen(4);
    }

    @Test
    public void testNumSpecialChar(){
        FuzzGen.inputFileGen(5);
    }

    @Test
    public void testAlphaSpecialChar(){
        FuzzGen.inputFileGen(6);
    }

    @Test
    public void testAllChar(){
        FuzzGen.inputFileGen(7);
    }

    @Test
    public void testNoChar(){
        FuzzGen.inputFileGen(8);
    }

}
