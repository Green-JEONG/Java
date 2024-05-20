package operator.ex;

public class OperationEx1 {
    public static void main(String[] args) {
//        int num1 = 10, num2 = 20, num3 = 30;
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3;  //int 끼리의 나눗셈은 자동으로 소수점 이하를 버림

        System.out.println(sum);
        System.out.println(average);
//        System.out.println("sum = " + sum + ", average = " + average);
        /*출력 메소드는 하나의 인수만 받으므로 여러 개의 문자열을 함께 출력하려면,
        연결해서 하나의 문자열로 만들어야 함.*/

    }
}
