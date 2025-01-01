package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; //컴파일 오류 발생
        intValue = (int)doubleValue;

        System.out.println(intValue);//int 타입보다 double 타입이 커서 자동형변환이 불가능함. 따라서, 명시적 캐스팅을 해줌
    }
}
