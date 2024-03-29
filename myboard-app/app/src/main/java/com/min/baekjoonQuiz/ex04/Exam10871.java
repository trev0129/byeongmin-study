package com.min.baekjoonQuiz.ex04;

import java.util.Scanner;

public class Exam10871 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);    
    int countNum = in.nextInt();
    in.nextLine();
    int[] numbers = new int[countNum];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = in.nextInt();
    }
    in.nextLine();
    int maxNum = 0;
    int minNum = 0;
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i - 1] < numbers[i]) {
        maxNum = numbers[i];
        minNum = numbers[i - 1];
      } else if (numbers[i - 1] > numbers[i]) {
        minNum = numbers[i];
        maxNum = numbers[i - 1];
      }
    }
    System.out.println(minNum + " " + maxNum);
    in.close();
  }
}
