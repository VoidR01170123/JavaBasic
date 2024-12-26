package method.ex;
/* bank account program
4 menu options
 1. deposit  2. withdraw  3. balance  4. exit
 2. if received numb of menu is not in the list, print out an error message
 3. if your balance is smaller than your withdrawing amount, show an error message
 */
// deposit flow : get deposit amount from the system -> add it to the total balance
//                -> continue or break(if it is switch structure)
// withdraw flow : get withdraw amount from the system -> compare it to the total balance
//                 -> if total balance is bigger than withdraw amount received, continue
//                 -> else, print error message and go back to the menu.
//                 -> if continued, calculate (balance) minus (withdraw amount)
//                 and put it into the var balance ag.

import java.util.Scanner;

public class MethodEx4RefP {

    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------------------");
            System.out.println("1.입급 | 2.출금 | 3.잔액확인 | 4.종료");
            System.out.println("----------------------------------");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            int amount;

            switch (choice) {
                case 1:
                    System.out.print("입금하실 금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = deposit(balance , amount);
                    break;

                case 2:
                    System.out.print("출금하실 금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    if (amount <= balance) {
                        balance = withdraw(balance,amount);
                        break;
                    } else {
                        System.out.println("잔액이 부족합니다.");
                    }

                case 3:
                    System.out.println("고객님의 현재 잔액은 " + balance + "입니다.");
                    break;

                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("올바른 메뉴를 선택하여 주십시오.");

            }



        }

    }
    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하셨습니다. 현재 잔액: " + balance + "원");
        return balance;
    }
    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하셨습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 하였으나 잔액이 부족합니다.");
        }
        return balance;

    }
}
