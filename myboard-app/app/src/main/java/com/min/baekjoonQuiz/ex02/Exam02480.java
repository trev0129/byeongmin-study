package com.min.baekjoonQuiz.ex02;

import java.util.Scanner;

public class Exam02480 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int dice1 = in.nextInt();
    int dice2= in.nextInt();
    int dice3 = in.nextInt();
    int result = 0;
    if (dice1 == dice2 && dice2 == dice3) {
      result = 10000 + dice1 * 1000;
      System.out.println(result);
    } else if (dice1 == dice2 && dice2 != dice3) {
      result = 1000 + dice1 * 100;
      System.out.println(result);

    } else if (dice1 == dice3 && dice2 != dice3) {
      result = 1000 + dice3 * 100;
      System.out.println(result);

    } else if (dice3 == dice2 && dice2 != dice1) {
      result = 1000 + dice2 * 100;
      System.out.println(result);
    } else {
      result = (dice1 > dice2) ? dice1 : dice2;
      System.out.println(((result > dice3) ? result : dice3) * 100);
    }
    in.close();
  }
}
