package com.fizzbuzz.number.impl;

import com.fizzbuzz.constants.FizzBuzzConstants;
import com.fizzbuzz.utils.MathCalculations;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 18/05/17 10:39
 */
public class DivisableByThreeProcessor implements IProcessNumber {
    public String getText(int pointedNumber) {
        String result = "";
        if (MathCalculations.isDivisibleByThree(pointedNumber)) result = FizzBuzzConstants.FIZZ;
        return result;
    }
}
