package com.craftinginterpreters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoxTest {

    private final List<Token> tokensList = new ArrayList<>();
    private final Scanner scanner;

    public LoxTest() {
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
    public void shouldRunFileAndReturnTokens(){
        Lox.
    }
}
