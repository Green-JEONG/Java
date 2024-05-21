package cond;

public class If1 {
    public static void main(String[] args) {
        int age = 20;   // 사용자 나이

        if (age >= 18) {
            System.out.println("성인입니다.");
        }
        /*
        age의 값은 20이므로 조건이 참으로 판명되고
        if문에 있는 코드 블록이 실행된다.
        */

        if (age < 18) {
            System.out.println("미성년자입니다.");
        }
        /*
        age의 값은 20이므로 조건이 거짓으로 판명되고
        해당 코드 블록은 실행되지 않는다.
         */
    }
}
