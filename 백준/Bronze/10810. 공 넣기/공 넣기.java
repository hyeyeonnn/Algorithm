import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader sr = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sr.readLine());

        int N = Integer.parseInt(st.nextToken());   // 바구니의 개수
        int M = Integer.parseInt(st.nextToken());   // 공을 넣는 횟수
        int[] arr = new int[N+1]; // N개의 바구니를 담은 배열

        for (int a = 1; a <= M; a++) {
            st = new StringTokenizer(sr.readLine(), " ");   // 공백으로 구분

            int i = Integer.parseInt(st.nextToken()); // 시작 범위
            int j = Integer.parseInt(st.nextToken()); // 끝 범위
            int k = Integer.parseInt(st.nextToken()); // 공 번호

            for (int b = i; b <= j; b++) {    // i부터 j까지 채우기
                arr[b] = k;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb);
    }
}