package com.min.baekjoonQuiz.ex03;

import java.util.Scanner;

public class Exam10950 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int count = in.nextInt();
    for (int i = 0; i < count; i++) {
      int a = in.nextInt();
      int b = in.nextInt();
      System.out.println(a + b);
    }
    in.close();
  }
}
