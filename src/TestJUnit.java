import org.junit.Assert;
import org.junit.Test;

public class TestJUnit {

    String message = "How are you doing?";
    MessageUtilForJUnitTesting messageUtilForJUnitTesting =
            new MessageUtilForJUnitTesting(message);
    @Test
    public void testPrintMessage(){
        Assert.assertEquals(message, messageUtilForJUnitTesting.printMessage());
    }
}
