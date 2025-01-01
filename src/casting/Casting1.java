package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; //int -> long,  int를 long에 넣으면 자동형변환
        System.out.println("longValue = " + longValue);

        doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue);//int를 double에 넣으면 자동형변환

        doubleValue = 20000000000L; //long -> double
        System.out.println("doubleValue2 = " + doubleValue); //long을 double에 넣으면 자동형변환
    }
} //
