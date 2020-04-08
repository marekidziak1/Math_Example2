package Math;
import org.junit.Test;
import org.junit.Assert;
import entity.Math;

public class MathMultiplicationArrayTest {
    @Test
    public void multiplicationArrayOneNumber(){
        //is
        int [] n = {1};
        //then
        final int result = Math.multiplicationArray(n);
        //expected
        Assert.assertEquals(1,result);
    }
    @Test
    public void multiplicationArrayOneNumberZero(){
        //is
        int [] n = {0};
        //then
        final int result = Math.multiplicationArray(n);
        //expected
        Assert.assertEquals(0,result);
    }
    @Test
    public void multiplicationArraySomeNumbers(){
        //is
        int [] n = {1,2,3};
        //then
        final int result = Math.multiplicationArray(n);
        //expected
        Assert.assertEquals(6,result);
    }
    @Test
    public void multiplicationArraySomeNumbersWithZero(){
        //is
        int [] n ={0,1,2,3};
        //then
        final int result = Math.multiplicationArray(n);
        //expected
        Assert.assertEquals(0,result);
    }
    @Test
    public void multiplicationArrayEmptyArray(){
        //is
        int [] n ={};
        //then
        final int result = Math.multiplicationArray(n);
        //expected
        Assert.assertEquals(0,result);
    }
}
