package com.huerta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Person implements Comparable<Person> {

  private String name;
  private int age;

  @Override
  public int compareTo(Person otherPerson) {
    return Integer.compare(this.age, otherPerson.getAge());
  }
}
