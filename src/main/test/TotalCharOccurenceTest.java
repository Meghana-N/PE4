import main.java.TotalCharOccurence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TotalCharOccurenceTest {
    TotalCharOccurence obj;
    @Before
    public void setUp()  {
        obj = new TotalCharOccurence();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void testCountCharOccurenceSuccess() {
        String inputString = "She sells seashells by the seashore";
        int actualStr = obj.countCharOccurence(inputString,"h");
        int expectedStr = 4;
        assertEquals(expectedStr,actualStr);
    }

    @Test
    public void testCountCharOccurenceFailure() {
        String inputString = "She sells seashells by the seashore";
        int actualStr = obj.countCharOccurence(inputString,"y");
        int expectedStr = 4;
        assertNotEquals(expectedStr,actualStr);
    }

}