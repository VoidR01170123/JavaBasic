package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----------------------------------");
            System.out.println("1.입급 | 2.출금 | 3.잔액확인 | 4.종료");
            System.out.println("----------------------------------");
            System.out.print("선택: ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.print("입금액을 입력하세요: ");
                int depositAmount = scanner.nextInt();
                balance = deposit(depositAmount, balance);
                continue; // if 문은 조건을 만족하면 자동으로 break가 되지만, switch case문은 break를 통해 나가준다.
            }

            else if (menu == 2) {
                System.out.print("출금액을 입력하세요: ");
                int withdrawAmount = scanner.nextInt();
                balance = withdraw(withdrawAmount, balance);
                continue;
            }

            else if (menu == 3) {
                balance(balance);
                continue; //if문 종료
            }

            else if (menu == 4) {
                System.out.println("시스템을 종료합니다.");
                return; //메인 종료
            }
            else {
                System.out.println("올바른 선택이 아닙니다. 다시 선택해 주세요.");
                continue;
            }

        }

    }

    public static int deposit(int depositAmount, int balance) {
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하셨습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int withdrawAmount, int balance) {
        if (balance > withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하셨습니다. 현재 잔액: " + balance + "원");
            return balance;
        } else {
            System.out.println(withdrawAmount+"원을 출금하려 했으나 잔액이 부족합니다.");
            return balance;
        }
    }

    public static void balance(int balance) {
        System.out.println("현재 잔액: " + balance);
    }
}
