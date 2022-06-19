package test.java.activity;

import main.java.activity.LaunchProcessImp;

import org.junit.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertTrue;

public class LaunchProcessImpTest {

    LaunchProcessImp launchProcessImp;

    @Before
    public void setup(){
       launchProcessImp = new LaunchProcessImp();
    }

    @Test
    @DisplayName("A test to refuel process is true")
    public void refuelProcess() throws InterruptedException {

        assertTrue("refuel was false",launchProcessImp.refuel(1000,3));
    }

    @Test
    @DisplayName("A test to strongback Retract process is true")
    public void strongbackRetractProcess() throws InterruptedException {
        launchProcessImp.refuel(1000,1);
        assertTrue("strongbackRetract was false",launchProcessImp.strongbackRetract(1000,3));
    }
}
