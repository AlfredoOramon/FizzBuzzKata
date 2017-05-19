package com.fizzbuzz.interfaces.evaluator;

import com.fizzbuzz.interfaces.IEvaluator;
import com.fizzbuzz.utils.MathCalculations;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 18/05/17 16:24
 */
public class DivisibleByThreeEvaluator implements IEvaluator {
    public boolean evaluate(int number) {
        return MathCalculations.isDivisibleByThree(number);
    }
}
