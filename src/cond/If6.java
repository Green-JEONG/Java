package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;// 아이템 가격
        int age = 10;//나이
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("1000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");

        if (true) System.out.println("if문에서 실행됨"); //실행하는 문장이 하나 일때 코드블록 생략 가능(단, 한 문장만 가능)하지만 권장하지 않음.
    }
}
