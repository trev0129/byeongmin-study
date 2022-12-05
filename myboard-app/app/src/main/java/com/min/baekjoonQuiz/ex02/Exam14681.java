package com.min.baekjoonQuiz.ex02;

import java.util.Scanner;

public class Exam14681 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    int y = in.nextInt();
    if (x > 0) {
      System.out.println((y > 0) ? "1" : "4");
    } else {
      System.out.println((y > 0) ? "2" : "3");
    }
  }
}
