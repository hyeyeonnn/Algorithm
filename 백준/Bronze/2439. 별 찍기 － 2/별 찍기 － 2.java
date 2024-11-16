import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        for(int i=1; i<=n; i++) {    // 줄 n 번 출력하기
            for(int j= 1 ; j <= n-i; j++) {    // 공백반복하기 (n-i) / n-1 , n-2, n-3 공백,,,!! 
                sb.append(" ");
            }
            for(int k=1; k<=i; k++) { // 1개부터 5개까지
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}