package com.min.baekjoonQuiz.ex03;

import java.util.Scanner;

public class Exam01110 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);    
    int num = in.nextInt();
    int result;
    int count = 0;
    if (num < 10) {
      num *= 10;
    } 
    result = num;

    while(true) {
      result = (result % 10 * 10) + (result / 10 + result % 10) % 10;
      count ++;
      if (result == num) {
        break;
      }
    }
    System.out.println(count);

    in.close();
  }
}
