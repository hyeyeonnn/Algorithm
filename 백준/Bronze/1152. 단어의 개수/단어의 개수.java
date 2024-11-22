import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine(); // 영어로 된 문자 공백포함

        StringTokenizer st = new StringTokenizer(a," "); // 공백을 기준으로 문자를 나눈다.
        System.out.println(st.countTokens()); // st 의 개수를 세어주는 countTokens
    }
}