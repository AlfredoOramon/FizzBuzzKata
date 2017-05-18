/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 18/05/17 10:31
 */
public class FizzBuzzProcessor {
    public String processNumberSayNumberOrWord(int pointedNumber)
    {
        if (MathCalculations.isDivisibleByThree(pointedNumber)) return FizzBuzzConstants.FIZZ;
        if (MathCalculations.isDivisibleByFive(pointedNumber)) return FizzBuzzConstants.BUZZ;
        return String.valueOf(pointedNumber);
    }
}
