package com.min.baekjoonQuiz.ex03;

import java.util.Scanner;

public class Exam10951 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);    
    while(in.hasNextInt()) {
      int a = in.nextInt();
      int b = in.nextInt();
      System.out.println(a + b);
    }
  }
}
