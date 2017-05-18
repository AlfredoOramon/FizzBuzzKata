import com.fizzbuzz.number.impl.IProcessNumber;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
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

    public String processNumberSayNumberOrWord(int pointedNumber) {

        return processNumber(pointedNumber);
    }

    private String processNumber(int pointedNumber) {
        String result = "";
        for (IProcessNumber processNumber : processorList) {
            result += processNumber.getText(pointedNumber);
        }
        return shouldReturnSameNumberIfEmpty(pointedNumber, result);
    }

    private String shouldReturnSameNumberIfEmpty(int pointedNumber, String result) {
        if (StringUtils.isEmpty(result)) {
            result = String.valueOf(pointedNumber);
        }
        return result;
    }

    public List<IProcessNumber> getProcessorList() {
        if (processorList == null) {
            processorList = new ArrayList<IProcessNumber>();
        }
        return processorList;
    }

    public void addProcessor(IProcessNumber divisableByThreeProcessor) {
        getProcessorList().add(divisableByThreeProcessor);
    }
}
