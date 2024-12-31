package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        // 3x3 2차원 배열을 만든다.
        int [][] arr = new int[][]{ //new int [][]도 생략 가능
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }; //행3, 열3


        //0행 출력
        for (int row = 0; row < arr.length; row++) {
            for (int colum = 0; colum < arr[row].length; colum++) {
                System.out.print(arr[row][colum] + " ");
            }
            System.out.println();
        }
    }
}
