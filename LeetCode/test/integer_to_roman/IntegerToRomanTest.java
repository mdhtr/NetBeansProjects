/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integer_to_roman;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author agi
 */
public class IntegerToRomanTest {

    private final IntegerToRoman toRoman = new IntegerToRoman();

    @Test
    public void shouldConvertOneDigitNumber() {
        assertThat(toRoman.convert(1), is("I"));
        assertThat(toRoman.convert(2), is("II"));
        assertThat(toRoman.convert(3), is("III"));
        assertThat(toRoman.convert(4), is("IV"));
        assertThat(toRoman.convert(5), is("V"));
        assertThat(toRoman.convert(6), is("VI"));
        assertThat(toRoman.convert(7), is("VII"));
        assertThat(toRoman.convert(8), is("VIII"));
        assertThat(toRoman.convert(9), is("IX"));
    }

    @Test
    public void shouldConvertTwoDigitNumber() {
        assertThat(toRoman.convert(10), is("X"));
        assertThat(toRoman.convert(24), is("XXIV"));
        assertThat(toRoman.convert(49), is("XLIX"));
        assertThat(toRoman.convert(77), is("LXXVII"));
        assertThat(toRoman.convert(91), is("XCI"));
    }

    @Test
    public void shouldConvertThreeDigitNumber() {
        assertThat(toRoman.convert(100), is("C"));
        assertThat(toRoman.convert(333), is("CCCXXXIII"));
        assertThat(toRoman.convert(461), is("CDLXI"));
        assertThat(toRoman.convert(655), is("DCLV"));
        assertThat(toRoman.convert(911), is("CMXI"));
    }

    @Test
    public void shouldConvertFourDigitNumber() {
        assertThat(toRoman.convert(1000), is("M"));
        assertThat(toRoman.convert(2015), is("MMXV"));
        assertThat(toRoman.convert(3999), is("MMMCMXCIX"));
    }

    @Rule
    public ExpectedException outOfRangeException = ExpectedException.none();

    @Test
    public void shouldHandleOutOfRangeNumbers() {
        outOfRangeException.expect(IllegalArgumentException.class);
        toRoman.convert(4242);
    }

    @Test
    public void shouldHandleNegativeNumbers() {
        outOfRangeException.expect(IllegalArgumentException.class);
        toRoman.convert(-42);
    }

}
