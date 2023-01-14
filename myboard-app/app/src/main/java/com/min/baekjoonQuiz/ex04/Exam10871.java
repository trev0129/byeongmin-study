package com.min.baekjoonQuiz.ex04;

import java.util.Scanner;

public class Exam10871 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);    
    int countNum = in.nextInt();
    int checkNum = in.nextInt();
    in.nextLine();
    int[] numbers = new int[countNum];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = in.nextInt();
    }
    in.nextLine();
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < checkNum) {
        System.out.printf("%d ", numbers[i]);
      }
    }
    in.close();
  }
}
