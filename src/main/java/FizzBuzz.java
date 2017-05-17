/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 15/05/17 15:30
 */
public class FizzBuzz {


    private static final String FIZZ_TEXT="Fizz";

    public String sayNumber(int pointedNumber) {
         return getNumberToSay(pointedNumber);
    }

    private String getNumberToSay(int pointedNumber) {
        String result = "";
        if (MathCalculations.isDivisibleByThree(pointedNumber)) {
            result = FIZZ_TEXT;
        } else {
            result = String.valueOf(pointedNumber);
        }
        return result;
    }
}
