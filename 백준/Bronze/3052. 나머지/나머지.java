import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];    // 10개의 수
        int cnt = 0;
        boolean check;

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt() % 42; // 내가 입력한 값 % 42 를 배열에 저장한다.
        }

        for(int i=0; i<arr.length; i++) {
            check = false;
            for(int j=i+1; j<arr.length; j++) {  // i와 i+1 의 값을 비교한다.
                if(arr[i] == arr[j]) {
                    check = true;
                    break;
                }
            }
            if(check == false) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}