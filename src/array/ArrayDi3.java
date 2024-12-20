package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        }; //행은 2, 열은 3;

        //0행 출력
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); //한 행이 끝나면 라인 변경
        }


    }
}
