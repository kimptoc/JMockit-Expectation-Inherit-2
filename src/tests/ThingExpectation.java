package tests;

import mockit.NonStrict;
import mockit.NonStrictExpectations;
import work.IThing;

/**
 * Created by IntelliJ IDEA.
 * User: kimptonc
 * Date: 11/04/11
 * Time: 10:08
 * To change this template use File | Settings | File Templates.
 */
final public class ThingExpectation extends NonStrictExpectations{

    @NonStrict IThing mockThing;

    public ThingExpectation() {
        {
            mockThing.jiggery(); result = "stuff";
        }
    }
}
