import initializeHashMapInDifferentWays.InitializeHashMap;
import org.junit.Assert;
import org.junit.Test;

public class InitializeHashMapTest {

    public InitializeHashMap MapInitializer;

    @Test
    public void givenStaticMapWhenUpdatedTheCorrect() throws Exception{
        //Given
        MapInitializer.articleMapOne.put("NewArticle1", "Convert array to List");

        // Then
        Assert.assertEquals(MapInitializer.articleMapOne.get("NewArticle1"),"Convert array to List");
    }
}
