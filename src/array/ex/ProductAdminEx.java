package array.ex;

/*
자바를 이용한 상품관리 프로그램
기능
1. 상품 등록 : 상품 이름과 가격을 입력받는다.
* 상품은최대 10개까지 등록 가능
2. 상품 목록 : 지금까지 등록한 모든 상품의 목록을 출력한다.
3. 첫 화면에서 다음과 같이 제시한다.
    1. 상품 등록  2. 상품 목록  3. 종료
*/

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxProduct = 10;
        int productCount = 0;
        String[] productNames = new String[maxProduct];
        int[] productPrices = new int[maxProduct];
        while (true)
        {
            System.out.print("1. 상품 등록  | 2. 상품 목록  |  3. 종료\n메뉴를 선택하세요:");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                if (maxProduct <= productCount)
                {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품 이름을 입력하세요:");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요:");
                productPrices[productCount] = scanner.nextInt();

                productCount++;


            }
             else if (option == 2)
             {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }




    }
}
