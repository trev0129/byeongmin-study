package com.min.baekjoonQuiz.ex03;

import java.util.Scanner;

public class Exam02439 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int star = in.nextInt();
    for (int i = 1; i <= star; i++) {
      for (int k = 1; k <= star - i; k++) {
        System.out.printf(" ");
      }
      for (int j = 1; j <= i; j++) {        
        System.out.printf("*");
      }
      System.out.printf("\n");
    }
    in.close();
  }
}
