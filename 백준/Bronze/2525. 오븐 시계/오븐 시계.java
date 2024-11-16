import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int A = sc.nextInt(); // 현재시간
      int B = sc.nextInt(); // 현재분
      int C = sc.nextInt(); // 요리하는데 필요한 분

      A += C/60;    // 몫
      B += C%60;    // 나머지

      if(B >= 60) {
          A += 1;   // 1 시간 추가
          B -= 60;  // 60 분 뺴기
      }
      if(A >= 24) {
          A -= 24;
      }
        System.out.println(A + " " + B);
    }
}