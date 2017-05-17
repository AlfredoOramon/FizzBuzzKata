import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 15/05/17 9:10
 */
@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {

    private static final String EXPECTED_ONE="1";
    private static final String EXPECTED_TWO="1";

    private static final String POINTED_WITH_ONE ="1";
    private static final String POINTED_WITH_TWO ="2";

    @Test
    public void sayNumber_WhenYouArePointedWithNumberOne_YouShouldDayOne()
    {
        String expected=EXPECTED_ONE;

        FizzBuzz SUT=new FizzBuzz();

        String result=SUT.sayNumber(POINTED_WITH_ONE);

        assertEquals("You should say one",expected,result);
    }

    @Test
    public void sayNumber_WhenYouArePointedWithTwo_YouShouldSayTwo() {
        final String expected = EXPECTED_TWO;

        FizzBuzz SUT = new FizzBuzz();
        String result = SUT.sayNumber(POINTED_WITH_TWO);

        Assert.assertEquals("You should say two", expected, result);
    }
}
