import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int length = 2*n-1;

        // 상단
        for(int i=1; i<length; i+=2) {  // i 는 현재 줄에서 출력할 * 의 개수를 말한다.
            for(int k=length-1; k>i ; k-=2) {  // 공백은 length 개부터 -2 개씩 줄여나감
                System.out.print(" ");
            }
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 하단
        for(int i=0; i<length; i+=2) {  // i 는 현재 줄에서 출력할 * 의 개수를 말한다.
            for(int k=0; k<i ; k+=2) {  // 공백은 length 개부터 -2 개씩 줄여나감
                System.out.print(" ");
            }
            for(int j=length; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}