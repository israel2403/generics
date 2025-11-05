package com.huerta;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenericsApp {

  private static final Logger log = LoggerFactory.getLogger(GenericsApp.class);

  public static <T> void addStore(T t, List<Bucket<T>> list) {
    Bucket<T> bucket = new Bucket<>(t);
    list.add(bucket);
    log.info("Item was added successfully: {}", t.toString());
  }

  public static <T> List<T> add(List<T> list, T item1, T item2) {
    list.add(item1);
    list.add(item2);
    return list;
  }

  public static void main(String[] args) {
    List<Bucket<String>> list = new ArrayList<>();
    GenericsApp.addStore("ana", list);
  }
}
