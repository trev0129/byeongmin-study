package com.min.baekjoonQuiz.ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exam01330 {
  public static void main(String[] args) throws IOException {
    //    Scanner in = new Scanner(System.in);
    //    int a = in.nextInt();
    //    int b = in.nextInt();
    //    in.close();
    //
    //    // 1) 일반적인 방법 
    //    if (a > b) {
    //      System.out.println(">");
    //    } else if (a < b) {
    //      System.out.println("<");
    //    } else {
    //      System.out.println("==");
    //    }
    //
    //    // 2) 3항 연산자 활용
    //    System.out.println((a>b)?">":(a<b)?"<":"==");


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 3) StringBuffer 활용 - StirngTokenizer
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    System.out.println((a>b)?">":(a<b)?"<":"==");





  } // main
}
