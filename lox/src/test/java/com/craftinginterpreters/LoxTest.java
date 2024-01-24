package com.craftinginterpreters;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoxTest {

  // private List<Token> tokensList;
	
	// @BeforeEach
	// void setUp(){
	// 	tokensList = new ArrayList<Token>();
	// }

  /**
   * Rigorous Test :-)
   */
  // @Test
  // public void shouldAnswerWithTrueArrays() {
  //   Scanner scanner = new Scanner("let");
  //   List<Token> tokens = scanner.scanTokens();

  //   Token identifierToken = new Token(TokenType.IDENTIFIER, "let", null, 0);
  //   Token eofToken = new Token(TokenType.EOF, "", null, 0);

  //   tokensList.add(identifierToken);
  //   tokensList.add(eofToken);

  //   Assertions.assertEquals(tokensList, tokens);
  // }

  @Test
  public void shouldAnswerWithTrue() {
    char c = '8';
    boolean result = new Scanner(Character.toString(c)).isDigit(c);
    Assertions.assertTrue(result);
  }

  @Test
  public void shouldAnswerWithError() {
    char c = 'a';
    boolean result = new Scanner(Character.toString(c)).isDigit(c);
    Assertions.assertFalse(result);
  }
}
