package com.min.baekjoonQuiz.ex03;

import java.util.Scanner;

public class Exam25304 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int total = in.nextInt();
    int count = in.nextInt();
    int result = 0;
    for (int i = 0; i < count; i++) {
      int menu = in.nextInt();
      int value = in.nextInt();
      result += (menu * value);
    }
    if (result == total) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    in.close();
  }
}
