import com.fizzbuzz.number.impl.ProcessNumber;

import java.util.List;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 15/05/17 15:30
 */
public class FizzBuzz {

    FizzBuzzProcessor fizzBuzzProcessor;

    public FizzBuzz()
    {
        fizzBuzzProcessor=new FizzBuzzProcessor();
    }

    public String sayNumber(int pointedNumber)
    {
        return fizzBuzzProcessor.processNumberSayNumberOrWord(pointedNumber);
    }
}
