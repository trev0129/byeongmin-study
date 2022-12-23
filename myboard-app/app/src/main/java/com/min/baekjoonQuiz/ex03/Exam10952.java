package com.min.baekjoonQuiz.ex03;

import java.util.Scanner;

public class Exam10952 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);    
    while(1==1) {
      int a = in.nextInt();
      int b = in.nextInt();
      if (a != 0 && b != 0) {
        System.out.println(a + b);
      } else {
        break;
      }
    }
    in.close();
  }
}
