import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
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

    private static final String EXPECTED_ONE = "1";
    private static final String EXPECTED_TWO = "2";
    private static final String EXPECTED_FIZZ = "Fizz";
    private static final String EXPECTED_BUZZ = "Buzz";

    private static final int POINTED_WITH_ONE = 1;
    private static final int POINTED_WITH_TWO = 2;
    private static final int POINTED_WITH_THREE = 3;
    private static final int POINTED_WITH_SIX = 6;
    private static final int POINTED_WITH_NINE = 9;


    private FizzBuzz SUT;

    @Before
    public void setUp() {
        SUT = new FizzBuzz();
    }

    //In gogle drive there is a good book that explain this practical unit testing with junit and mockito
    private static final Object[] getPointedNumbersAndSayNumbers() {

        return new Object[]{

                new Object[]{POINTED_WITH_ONE, EXPECTED_ONE},
                new Object[]{POINTED_WITH_TWO, EXPECTED_TWO},
                new Object[]{POINTED_WITH_THREE, EXPECTED_FIZZ},
                //new Object[]{POINTED_WITH_SIX, EXPECTED_FIZZ},
                //new Object[]{POINTED_WITH_NINE, EXPECTED_FIZZ},
                //new Object[]{POINTED_WITH_NINE, EXPECTED_FIZZ},
                //new Object[]{POINTED_WITH_SIX, EXPECTED_BUZZ},
                //new Object[]{POINTED_WITH_NINE, EXPECTED_FIZZ},
                //new Object[]{POINTED_WITH_NINE, EXPECTED_FIZZ},
        };
    }

    @Test
    @Parameters(method = "getPointedNumbersAndSayNumbers")
    public void sayNumber_WhenYouArePointedWithNumberANumber_YouShouldSayExpectedSaidNumber(int pointedNumber, String expectedSaidNumber) {
        String expected = expectedSaidNumber;

        String result = SUT.sayNumber(pointedNumber);

        assertEquals("You should say"+expected, expectedSaidNumber, result);
    }
}
