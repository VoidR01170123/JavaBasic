package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int i = 1, sum = 0, max = 3;
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println("sum=" + sum);
    }
}
//반복문 복습완료