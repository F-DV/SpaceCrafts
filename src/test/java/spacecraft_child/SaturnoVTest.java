package test.java.spacecraft_child;

import main.java.spacecraft_child.SaturnoV;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class SaturnoVTest {
    SaturnoV saturnoV;

    @Before
    public void setup(){
        saturnoV = new SaturnoV("Carga");
    }

    @Test
    public void CorrectTakeoffProcess() throws InterruptedException {
        assertTrue(saturnoV.launch());
    }

}
