package Math;

import entity.Math;
import org.junit.Test;
import org.junit.Assert;


public class MathFactorialTest {
    @Test
    public void countFactorialTest(){
        //is
        int n = 5;
        //then
        final int result = Math.countFactorial(n);
        //excpected
        Assert.assertEquals(120,result);
    }

    @Test
    public void countFactorialHighValue(){
        int n=10;
        final int result = Math.countFactorial(n);
        Assert.assertEquals(3628800,result);
    }
    @Test
    public void countFactorialLowValue(){
        int n=1;
        final int result = Math.countFactorial(n);
        Assert.assertEquals(1,result);
    }
    @Test
    public void countFactorialZero(){
        int n=0;
        final int result = Math.countFactorial(0);
        Assert.assertEquals(1, result);
    }
}
