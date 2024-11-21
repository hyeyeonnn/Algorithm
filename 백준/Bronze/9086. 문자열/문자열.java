import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();  // 입력버퍼지움
        String a[] = new String[T];

        for(int i=0; i<T; i++) {
            a[i] = sc.nextLine();
        }

        for(int j=0; j<T; j++) {
            char c = a[j].charAt(0);
            char d = a[j].charAt(a[j].length() - 1);
            System.out.println(c + "" + d);
        }
    }
}