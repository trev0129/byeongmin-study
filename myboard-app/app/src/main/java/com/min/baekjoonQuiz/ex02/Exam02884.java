package com.min.baekjoonQuiz.ex02;

import java.util.Scanner;

public class Exam02884 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int h = in.nextInt();
    int m = in.nextInt();
    if (m >= 45) {
      m -= 45;
    } else {
      m += 15;
      h -= 1;
      if (h == -1) {
        h = 23;
      }
    }
    System.out.println(h + " " + m);
    in.close();
  }
}
