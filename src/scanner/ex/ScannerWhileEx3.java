package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int numb = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
//        while (true) {
//            int numb = input.nextInt();
//            if (numb == -1) {
//                break;}
//            sum += numb;
//            count++;
//
//        }
        while ((numb = input.nextInt()) != -1) {
            sum += numb;
            count++;
        }


        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);}
    }

