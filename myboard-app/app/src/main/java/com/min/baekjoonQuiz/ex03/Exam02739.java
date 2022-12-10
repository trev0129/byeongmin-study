package com.min.baekjoonQuiz.ex03;

import java.util.Scanner;

public class Exam02739 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    for (int i = 1; i < 10; i++) {
      System.out.println(x + " * " + (i) + " = " + (x * i));
    }
  }
}
