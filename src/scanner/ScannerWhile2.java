package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("첫 번째 숫자를 입력: ");
            int a = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력: ");
            int b = scanner.nextInt();

            if (a == 0 && b == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                int sum = a + b;
                System.out.println("두 수의 합은 " + sum);
            }


        }
    }
}
