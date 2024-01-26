package com.craftinginterpreters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ScannerTest {

    @InjectMocks
    Scanner scanner;

    @Mock
    List<Token> tokensList;

    @BeforeEach
    public void setUp() {
        scanner = spy(new Scanner("let"));
        tokensList = new ArrayList<>();
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

    @Test
    public void shouldCheckScannerStringMethod() {
        doNothing().when(scanner).string();

        scanner.string();
        verify(scanner).string();
    }

    @Test
    public void shouldReturnSomeCharsFromAdvance() {
        char returnedValue = scanner.advance();

        Assertions.assertEquals('l', returnedValue);
        scanner.advance();
        returnedValue = scanner.advance();

        Assertions.assertEquals('t', returnedValue);
    }

    @Test
    public void shouldReturnSomeCharsFromPeekNext() {
        char returnedValue = scanner.peekNext();

        Assertions.assertEquals('e', returnedValue);

        returnedValue = scanner.peekNext();
        Assertions.assertEquals('e', returnedValue);
    }
}
