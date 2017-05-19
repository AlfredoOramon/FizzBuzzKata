package com.fizzbuzz.number.impl;

import com.fizzbuzz.interfaces.IProcessNumber;
import com.fizzbuzz.interfaces.IEvaluator;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 18/05/17 10:39
 */
public class NumberProccesor implements IProcessNumber {
    private IEvaluator evaluator;
    private String textToSay;

    public NumberProccesor(IEvaluator evaluator, String textToSay) {
        this.evaluator = evaluator;
        this.textToSay = textToSay;
    }

    public String getWordToSay(int pointedNumber) {
        String result = "";
        if (evaluator.evaluate(pointedNumber)) {
            result = textToSay;
        }
        return result;
    }
}
