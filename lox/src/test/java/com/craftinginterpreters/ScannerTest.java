package com.craftinginterpreters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ScannerTest {
    private final List<Token> tokensList = new ArrayList<>();
    private final Scanner scanner;

    public ScannerTest() {
        this.scanner = new Scanner("let");
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldCheckTokensListAndTokenType() {
        Token identifierToken = new Token(TokenType.IDENTIFIER, "let", null, 0);
        Token eofToken = new Token(TokenType.EOF, "", null, 0);

        List<Token> tokens = scanner.scanTokens();

        tokensList.add(identifierToken);
        tokensList.add(eofToken);

        Assertions.assertEquals(tokens.size(), tokensList.size());
        Assertions.assertEquals(identifierToken.getType(), TokenType.IDENTIFIER);
    }
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
