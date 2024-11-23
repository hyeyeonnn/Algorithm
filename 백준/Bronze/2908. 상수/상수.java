import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();   // a 값 입력
        int b = sc.nextInt();   // b 값 입력

        // StringBuilder를 a 와 b 에 각각 담아줘야 하기 때문에 new StringBuilder 을 괄호 안에 초기화 한 것이다
        a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
        b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());

        System.out.println(a>b?a:b);    // 삼항연산자 : a 가 b 보다 크다면 a 출력 그렇지 않다면 b 출력
    }
}
