package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        //example of Prefix Increment Operator
        int a = 1;
        int b = 0;

        b = ++a; //a increases first, and substituted into b
        System.out.println("a = " + a + ", b = " + b);

        //example of Postfix Increment Operator
        a = 1; // renew a as 1
        b = 0; // renew b as 0

        b = a++; //substitute a into b, and add 1 to a
        System.out.println("a = " + a + ", b = " + b); //Result : a = 2, b = 1

    }
}
