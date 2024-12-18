package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("합계를 계산할 정수를 입력하세요:");
            int a = input.nextInt();
            sum += a;
            if (a == 0) {
                System.out.print("프로그램을 종료합니다.");
                break;
            }
        }
        System.out.print("합계는 " + sum);
    }
}
