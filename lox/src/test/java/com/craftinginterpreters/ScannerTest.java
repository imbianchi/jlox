package com.craftinginterpreters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScannerTest {

    @Test
    public void shouldCheckIfACharIsADigit() {
        char c = '8';
        boolean result = new Scanner(Character.toString(c)).isDigit(c);
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldAnswerFalseToDigitChar() {
        char c = 'a';
        boolean result = new Scanner(Character.toString(c)).isDigit(c);
        Assertions.assertFalse(result);
    }
}
