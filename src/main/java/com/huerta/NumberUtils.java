package com.huerta;

import java.util.List;

public class NumberUtils {

  /*
   * We can restrict the types than can be passed to a
   * type paramter. This is know as bounded type parameters.
   */

  public static <T extends Comparable<T>> T min(T item1, T item2) {
    return (item1.compareTo(item2) < 0) ? item1 : item2;
  }

  public static <T extends Number> double add(T num1, T num2) {
    if (num1 == null || num2 == null) {
      throw new IllegalArgumentException("Numbers must not be null");
    }
    return num1.doubleValue() + num2.doubleValue();
  }

  public static <T extends Number> double add(List<T> list) {
    double result = 0.0;
    for (T item : list)
      result += item.doubleValue();
    return result;
  }

  public static <T extends Comparable<T>> int countGreaterItems(T[] items, T item) {
    if (items == null)
      throw new IllegalArgumentException("items must not be null");
    int count = 0;
    for (T element : items) {
      if (element == null)
        continue;
      if (element.compareTo(item) > 0)
        count++;
    }
    return count;
  }
}
