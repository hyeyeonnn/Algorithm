import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();    // 몇개의 수를 입력할까요
        String num = sc.next();
        int sum = 0;

        for(int i=0; i<n; i++) {
            sum += num.charAt(i) - 48;
        }
        System.out.println(sum);

    }
}