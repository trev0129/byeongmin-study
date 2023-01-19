package com.min.programmers.ex01;

public class test02 {
  public static void main(String[] args) {
    class Solution { // 푸드 파이트 대
      public String solution(int[] food) {
        String answer = "";
        String prefix = "";
        String suffix = "";

        if (food[0] == 1) {
          answer += 0;
        }

        for (int i = food.length - 1; i > 0; i--) {
          for (int j = 0; j < (food[i] / 2); j ++) {
            prefix = i + prefix;
            suffix = suffix + i;
          }
        }

        answer = prefix + answer + suffix;

        return answer;
      }
    }
  }
}
