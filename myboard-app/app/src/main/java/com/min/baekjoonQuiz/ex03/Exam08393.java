package com.min.baekjoonQuiz.ex03;

import java.util.Scanner;

public class Exam08393 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int count = in.nextInt();
    int result = 0;
    for (int i = 1; i <= count; i++) {
      result += i;
    }
    System.out.println(result);
    in.close();
  }
}
