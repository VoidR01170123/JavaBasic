package array.ex;

import java.util.Scanner;

public class ArrayEx7Re {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][]scores = new int[4][3]; //scores라고 하는 2차원 배열 생성
        String[] subjects = {"국어","영어","수학"};
        double average = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + "점수:");
                scores[i][j] = scanner.nextInt();
            }

        }
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += scores[i][j];
            }
            average = sum / (double)3;
            System.out.println((i+1)+"번 학생의 총점: "+ sum + " 평균: " + average);
        }
    }
}
