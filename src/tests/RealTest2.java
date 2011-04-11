package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import work.IThing;

/**
 * Created by IntelliJ IDEA.
 * User: kimptonc
 * Date: 06/04/11
 * Time: 10:00
 * To change this template use File | Settings | File Templates.
 */
public class RealTest2 {

    @BeforeMethod
    public void initThing()
    {
        System.out.println("initThing Mocking");
        new ThingExpectation();
    }

    @Test
    public void aNoddyTest()
    {
        IThing mockThing = new IThing();
        String jiggery = mockThing.jiggery();
        assert jiggery.equals("stuff") : "found stuff?";
    }

}
