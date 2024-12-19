package scanner.ex;

import java.util.Scanner;

//상품명(name), 가격(price), 수량(quantity)을 시스템에서 입력받음 ㅇ
//총 가격 출력(totalPrice) ㅇ
//상품입력, 결제, 프로그램 종료 기능 구현 ㅇ
//옵션은 모두 정수로 입력받고, option 변수에 저장 ㅇ
//상품입력 옵션을 선택하면, 사용자에게 상품명과 가격, 수를 입력받기ㅇ
//결제옵션을 선택하면, 총 비용을 출력하고, 총 비용을 0으로량 초기화 ㅇ
//프로그램 종료옵션을 선택하면, "프로그램을 종료합니다" 출력 후 종료 ㅇ
//위 옵션 외에 다른 값을 입력하면 "올바른 옵션을 선택해주세요." 메시지 출력 ㅇ

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int totalPrice = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();

            if (option == 1) {
                scanner.nextLine();

                System.out.print("상품명을 입력하세요: ");
                String name = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = scanner.nextInt();

                totalPrice += price * quantity; //상품이 누적되므로, 기존 totalPrice에 누적해야함

                System.out.println("상품명:" + name + " 가격:" + price + " 수량:" + quantity + " 합계:" + price * quantity); // 누적값이라서 역서 totalPrice 사용 안됨
            }
            else if (option == 2) {
                System.out.println("총 비용: " + totalPrice);
                totalPrice = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
            }
        }
    }
//스위치문을 쓰는 게 더 좋음. 스위치문으로도 연습해보기