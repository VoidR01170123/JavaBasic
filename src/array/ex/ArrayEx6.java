package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요.:");
        int count = input.nextInt();
        int maximum , minimum;
        System.out.println(count +"개의 정수를 입력하세요.:");
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = input.nextInt();
        }

        maximum = arr[0];
        minimum = arr[0];
        for (int i = 0; i < count; i++) {
            if(arr[i] < minimum){
                minimum = arr[i];
            }
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }

        System.out.println("가장 작은 정수: " + minimum);
        System.out.println("가장 큰 정수: " + maximum);



    }
}
