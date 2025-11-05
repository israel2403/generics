package com.huerta;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Bucket<T> {

  private T item;
}
