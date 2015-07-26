/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integer_to_roman;

import java.util.Arrays;
import java.util.List;

/**
 * @author agi https://leetcode.com/problems/integer-to-roman/ Given an integer,
 * convert it to a roman numeral. Input is guaranteed to be within the range
 * from 1 to 3999.
 */
public class IntegerToRoman {

    private final List<String> ones;
    private final List<String> tens;
    private final List<String> hundreds;
    private final List<String> thousands;

    private static final int TEN = 10;
    private static final int HUNDRED = 100;
    private static final int THOUSAND = 1000;
    private static final int LOWER_LIMIT = 0;
    private static final int UPPER_LIMIT = 3999;

    public IntegerToRoman() {
        this.ones = Arrays.asList(new String[]{
            "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"});
        this.tens = Arrays.asList(new String[]{
            "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"});
        this.hundreds = Arrays.asList(new String[]{
            "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"});
        this.thousands = Arrays.asList(new String[]{
            "", "M", "MM", "MMM"});
    }

    public String convert(final int number) {
        if (isOutOfRange(number)) {
            throw new IllegalArgumentException("Cannot convert number out of range 1-3999");
        }
        return doConvert(number);
    }

    private boolean isOutOfRange(final int number) {
        return number > UPPER_LIMIT || number < LOWER_LIMIT;
    }

    private String doConvert(final int number) {
        return convertThousand(number) + convertHundred(number)
                + convertTen(number) + convertOne(number);
    }

    private String convertOne(final int number) {
        return ones.get(number % THOUSAND % HUNDRED % TEN);
    }

    private String convertTen(final int number) {
        return tens.get(number % THOUSAND % HUNDRED / TEN);
    }

    private String convertHundred(final int number) {
        return hundreds.get(number % THOUSAND / HUNDRED);
    }

    private String convertThousand(final int number) {
        return thousands.get(number / THOUSAND);
    }

}
