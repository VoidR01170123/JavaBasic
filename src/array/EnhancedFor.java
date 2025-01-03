package array;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for문
        for (int i = -0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
        
        //향상된 for문, for-each문
        for (int number : numbers) { //단축키는 iter , 실무에서 많이 씀
            System.out.println(number);
        }

        //향상된 for문(for-each)을 사용할 수 없는 경우 : 증가하는 index값이 필요할 때
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }

    }//복습완료 12_31
}
