package operator;

public class Operator1 {
    public static void main(String[] args) {
        //Initialize Variables
        int a = 5;
        int b = 2;

        //addition
        int sum = a + b;
        System.out.println("a + b = " + sum); // a + b = 7

        //subtraction
        int diff = a - b;
        System.out.println("a - b = " + diff); // a - b = 3

        //multiplication
        int multi = a * b;
        System.out.println("a * b = " + multi); // a * b = 10

        //division
        int div = a / b; //output is 2(int type)
        System.out.println("a / b = " + div); // a / b = 2

        //remainder
        int mod = a % b; // quotient is 2 , remainder is 1
        System.out.println("a % b = " + mod); // a % b = 1



    }
}
