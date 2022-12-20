package com.min.baekjoonQuiz.ex03;

import java.util.Scanner;

public class Exam02438 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int star = in.nextInt();
    int count = 1;
    for (int i = 0; i <= star; i++) {
      for (int j = 0; j < i; j++) {        
        System.out.printf("*");
      }
      if (i == count) {
        System.out.printf("\n");
        count++;
      }
    }
    in.close();
  }
}
