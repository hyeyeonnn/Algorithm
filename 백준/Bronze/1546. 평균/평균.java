import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 시험을 본 과목 개수
        double arr_1[] = new double[n]; // 점수를 저장할 배열이다.
        double arr_2[] = new double[n]; // 조작한 점수를 저장할 배열이다.
        double sum = 0;

        for(int i=0; i<n; i++) {
            arr_1[i] = sc.nextInt();  // 각 점수들 입력하기
        }

        Arrays.sort(arr_1); // arr_1 을 오름차순으로 정렬한다. (작은 점수부터)

        for(int i=0; i<arr_1.length; i++) {
            double m = arr_1[n-1];  // 최고점수이다.(맨 마지막 값)
            arr_2[i] = arr_1[i]/m * 100;    // 새로운 배열에 조작한 점수를 넣는다.
        }

        for(int i=0; i<arr_2.length; i++) {
            sum += arr_2[i];    // 합계 저장
        }

        double avg = (double)(sum/n);
        System.out.println(avg);
    }
}
