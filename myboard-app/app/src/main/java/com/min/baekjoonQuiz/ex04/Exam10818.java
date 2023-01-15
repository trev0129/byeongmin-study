package com.min.baekjoonQuiz.ex04;

import java.util.Scanner;

public class Exam10818 {
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
    for (int i = 0; i < numbers.length; i++) {
      if (i == 0) {
        maxNum = minNum = numbers[i];
        continue;
      }
      if (numbers[i] > maxNum) {
        maxNum = numbers[i];
      }
      if (numbers[i] < minNum) {
        minNum = numbers[i];
      }
    }
    System.out.println(minNum + " " + maxNum);
    in.close();
  }
}
