import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();  // 단어입력

       for(char i='a'; i<='z'; i++) {
           System.out.print(s.indexOf(i) + " ");
           // indexOf 는 값이 없으면 -1 을 리턴한다 !!!!
       }

    }
}