package com.min.baekjoonQuiz.ex02;

import java.util.Scanner;

public class Exam02525 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int h = in.nextInt();
    int m = in.nextInt();
    int t = in.nextInt();
    m += t;
    while(m > 59) {
      m -= 60;
      h += 1;
      if (h == 24) {
        h = 0;
      }
    }
    System.out.println(h + " " + m);
    in.close();
  }
}
