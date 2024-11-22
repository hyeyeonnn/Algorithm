import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 바구니 개수 n
        int arr[] = new int[n]; // n개의 바구니들
        int m = sc.nextInt();   // 바구니를 바꿀 횟수
        int temp = 0;   // 값을 저장할 저장소이다

        for(int i=0; i<n; i++) {
            arr[i] = i+1;   // 배열에 1 부터 n 까지 수를 넣는다.
        }

        for(int x=1; x<=m; x++) {   // m 의 수만큼 바구니를 역순으로 바꾼다.
            int i = sc.nextInt()-1;   // i 번째 입력 (배열은 0부터 시작하니까 -1 해줘야 한다)
            int j = sc.nextInt()-1;   // j 번째 입력 (배열은 0부터 시작하니까 -1 해줘야 한다)

            while(i < j) { // i 가 j 보다 작을동안 반복한다.
                temp = arr[i]; // i 번째 값 temp 에 저장
                arr[i++] = arr[j];  // i+1 값은 j 이다
                arr[j--] = temp;    // j-1 은 temp 이다
            }
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
