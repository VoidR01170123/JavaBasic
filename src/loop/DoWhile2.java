package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        }
        while (i < 3);
        } // do-while은 최초 한 번을 반드시 실행해야 하는 경우
    }

