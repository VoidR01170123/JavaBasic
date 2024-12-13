package cond.ex;

public class CondOpEx {
    public static void main(String[] args) {
        int a = 10, b = 20;

        int bigger = (b-a > 0) ? b : a;

        System.out.println("더 큰 숫자는 " + bigger + "입니다.");


    }
}
