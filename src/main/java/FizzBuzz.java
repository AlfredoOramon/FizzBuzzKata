import com.fizzbuzz.number.impl.DivisableByFiveProccesor;
import com.fizzbuzz.number.impl.DivisableByThreeProcessor;

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
        fizzBuzzProcessor.addProcessor(new DivisableByThreeProcessor());
        fizzBuzzProcessor.addProcessor(new DivisableByFiveProccesor());
    }

    public String sayNumber(int pointedNumber)
    {
        return fizzBuzzProcessor.processNumberSayNumberOrWord(pointedNumber);
    }
}
