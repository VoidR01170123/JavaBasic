package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] score = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        int students = 0;
        System.out.println("학생 수를 입력하세요:");
        students = input.nextInt();

        for (int i = 0; i < students; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < 3; j++) {
                System.out.println(subjects[j] + " 점수:");
                score[i][j] = input.nextInt();
            }

        }
        for (int i = 0; i < students; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += score[i][j];
            }
            double average = total / 3.0;
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }

    }
}
