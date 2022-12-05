package com.min.baekjoonQuiz.ex02;

import java.util.Scanner;

public class Exam02753 {
  public static void main(String[] args) {
    int year = (new Scanner(System.in)).nextInt();
    if (year%4 == 0 && year%100 != 0) {
      System.out.println(1);
    } else if (year%400 == 0) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
