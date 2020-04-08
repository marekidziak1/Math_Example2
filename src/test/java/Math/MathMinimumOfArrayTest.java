package Math;
import entity.Math;
import org.junit.Test;
import org.junit.Assert;

public class MathMinimumOfArrayTest {
    @Test
    public void MinimumOfArrayOneNumber(){
        //is
        int [] n={3};
        //then
        final int result = Math.minimumOfArray(n);
        //expected
        Assert.assertEquals(3,result);
    }
    @Test
    public void MinimumOfArraySomeNumbers(){
        //is
        int [] n={5,4,2};
        //then
        final int result = Math.minimumOfArray(n);
        //expected
        Assert.assertEquals(2,result);
    }
    @Test
    public void MinimumOfArrayTheSameMinimumNumbers(){
        //is
        int [] n={3,5,3,5,4,4,4,5,3};
        //then
        final int result=Math.minimumOfArray(n);
        //expected
        Assert.assertEquals(3,result);
    }
    @Test
    public void MinimumOfArrayEmptyArray(){
        //is
        int [] n={};
        //then
        final int result=Math.minimumOfArray(n);
        //expected
        Assert.assertEquals(0,result);
    }
}
