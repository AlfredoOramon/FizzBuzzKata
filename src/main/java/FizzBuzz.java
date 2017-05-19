import com.fizzbuzz.constants.FizzBuzzConstants;
import com.fizzbuzz.interfaces.IProcessNumber;
import com.fizzbuzz.interfaces.evaluator.DivisibleByFiveEvaluator;
import com.fizzbuzz.interfaces.evaluator.DivisibleByThreeEvaluator;
import com.fizzbuzz.number.impl.NumberProccesor;

import java.util.ArrayList;
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

    public FizzBuzz() {
        List<IProcessNumber> evaluatorsList = new ArrayList<IProcessNumber>(3);

        IProcessNumber processNumberDivisibleByThree = new NumberProccesor(new DivisibleByThreeEvaluator(), FizzBuzzConstants.FIZZ);
        evaluatorsList.add(processNumberDivisibleByThree);

        IProcessNumber processNumberDivisibleByFive = new NumberProccesor(new DivisibleByFiveEvaluator(), FizzBuzzConstants.BUZZ);
        evaluatorsList.add(processNumberDivisibleByFive);

        fizzBuzzProcessor = new FizzBuzzProcessor(evaluatorsList);
    }

    public String sayNumber(int pointedNumber)
    {
        return fizzBuzzProcessor.processNumberSayNumberOrWord(pointedNumber);
    }
}
