import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String a = sc.next();
        String b = sb.append(a).reverse().toString();

        if(a.equals(b)) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}