package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scanner 삽입

        int [] arr = new int [5]; //크기 5의 배열 선언
        System.out.println("정수 5개를 입력하세요:"); //입력문구 출력
        for (int i = 0; i < arr.length; i++) {//5개 입력받기(역순으로 받기)
            arr[i] = input.nextInt();
        }

        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i >0) {
                System.out.print(", ");
            }
        }


    }
}
