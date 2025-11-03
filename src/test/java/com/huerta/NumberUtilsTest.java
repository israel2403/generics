package com.huerta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {
  NumberUtils numberUtils;

  @BeforeEach
  void setup() {
    numberUtils = new NumberUtils();
  }

  @Test
  public void test_count_greater_items_with_strings() {
    // Arrange
    String[] items = { "Hi", "Hello", "Bye", "Goodbye" };
    String item = "Bye";
    int expected = 3;

    // Act
    int actual = numberUtils.countGreaterItems(items, item);

    // Assert
    assertEquals(expected, actual);
  }
}
