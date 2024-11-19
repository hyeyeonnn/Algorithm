import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();    // 바구니의 개수
        int m = sc.nextInt();      // 바구니 바꾸는 횟수
        int arr[] = new int[n];   // 바구니 배열
        // 1번 바구니 = 1번공, 2번 바구니 = 2번공 ...
        int temp = 0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = i+1;   // 배열에 값 담기
        }

        for(int a=0; a<m; a++) {      // 공을 m번 변경한다
            int i = sc.nextInt();     // i 번째 바구니
            int j = sc.nextInt();    // j 번째 바구니

            temp = arr[i-1];    // temp 임시공간 만들기 값 저장해놓기!
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }
}
