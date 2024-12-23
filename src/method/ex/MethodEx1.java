package method.ex;

public class MethodEx1 {
//    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        int c = 3;
//
//        int sum = a + b + c;
//        double average = sum / 3.0;
//        System.out.println("평균값: " + average);
//
//        int x = 15;
//        int y = 25;
//        int z = 35;
//
//        sum = x + y + z;
//        average = sum / 3.0;
//        System.out.println("평균값: " + average);
//    }
public static void main(String[] args) {

    avg(1, 2, 3);
    avg(15,25,35);
}

    public static void avg(int a, int b, int c) {
        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("평균값: " +average);
    }
}
