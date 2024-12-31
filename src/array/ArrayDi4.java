package array;

public class ArrayDi4 {
    public static void main(String[] args) {

        int[][] arr = new int[2][3];

        int i = 1;
        for (int row = 0; row < arr.length; row++) { //length는 배열이 포함하고 있는 요소의 개수, 즉 길이를 의미함.
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] =  i++;
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
