package com.min.baekjoonQuiz.ex02;

import java.util.Scanner;

public class Exam09498 {
  public static void main(String[] args) {
    int grade = (new Scanner(System.in)).nextInt();
    if (grade>=90) {
      System.out.println("A");
    } else if (grade>=80) {
      System.out.println("B");
    } else if (grade>=70) {
      System.out.println("C");
    } else if (grade>=60) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }
  }
}
