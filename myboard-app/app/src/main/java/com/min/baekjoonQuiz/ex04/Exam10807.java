package com.min.baekjoonQuiz.ex04;

import java.util.Scanner;

public class Exam10807 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);    
    int num = in.nextInt();
    in.nextLine();
    int[] numbers = new int[num];
    for (int i = 0; i < num; i++) {
      numbers[i] = in.nextInt();
    }
    in.nextLine();
    int findNum = in.nextInt();
    int count = 0;
    for (int i = 0; i < num; i++) {
      if (numbers[i] == findNum) {
        count++;
      } 
    }
    System.out.println(count);

    in.close();
  }
}
