package com.huerta;

public class NumberUtils {

  /*
   * We can restrict the types than can be passed to a
   * type paramter. This is know as bounded type parameters.
   */

  public static <T extends Comparable<T>> T min(T item1, T item2) {
    return (item1.compareTo(item2) < 0) ? item1 : item2;
  }
}
