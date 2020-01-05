import org.junit.Assert;
import org.junit.Test;

public class TestSumInteger{

    @Test
    public void TestIntegerSumCheck(){

        SumIntegersAndCompareIfSumOfOneEqualsTheOther sumIntegersAndCompare = new SumIntegersAndCompareIfSumOfOneEqualsTheOther();
        //Given
        boolean result = sumIntegersAndCompare.IntegerSumCheck(2025, 2034);

        // Then
        Assert.assertEquals(true, result);
    }

}
