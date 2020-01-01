import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSumInteger{

    @Test
    public void TestIntegerSumCheck(){
        SumIntegersAndCompareIfSumOfOneEqualsTheOther sumIntegersAndCompare = new SumIntegersAndCompareIfSumOfOneEqualsTheOther();
        boolean result = sumIntegersAndCompare.IntegerSumCheck(2025, 2034);
        assertEquals(true, result);
    }

}
