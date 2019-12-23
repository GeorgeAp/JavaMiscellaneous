import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FullHashmapImplementationTest {
    @Test
    public void testHashmap(){

        FullHashmapImplementation<String, String> fullHashmapImplementation = new FullHashmapImplementation<>();
        fullHashmapImplementation.put("France", "Paris");
        fullHashmapImplementation.put("Italy", "Rome");
        fullHashmapImplementation.put("Germany", "Berlin");
        fullHashmapImplementation.put("Belgium", "Brussels");

        assertNotNull("The object is not empty",fullHashmapImplementation);
        assertEquals(4, fullHashmapImplementation.size());
        assertEquals("Berlin", fullHashmapImplementation.get("Germany"));
        assertEquals("Paris", fullHashmapImplementation.get("France"));
    }
}
