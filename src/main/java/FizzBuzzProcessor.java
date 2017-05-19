import com.fizzbuzz.interfaces.IProcessNumber;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 18/05/17 10:31
 */
public class FizzBuzzProcessor {

    private List<IProcessNumber> processorList;

    public FizzBuzzProcessor(List<IProcessNumber> processorList) {
        this.processorList = processorList;
    }

    public String processNumberSayNumberOrWord(int pointedNumber) {

        return processNumber(pointedNumber);
    }

    private String processNumber(int pointedNumber) {
        String result = "";
        for (IProcessNumber processNumber : processorList) {
            result += processNumber.getWordToSay(pointedNumber);
        }
        return shouldReturnSameNumberIfEmpty(pointedNumber, result);
    }

    private String shouldReturnSameNumberIfEmpty(int pointedNumber, String result) {
        if (StringUtils.isEmpty(result)) {
            result = String.valueOf(pointedNumber);
        }
        return result;
    }
}
