package operator;

public class Operator1 {
    public static void main(String[] args) {
        // ���� �ʱ�ȭ
        int a = 5;
        int b = 2;

        // ����
        int sum = a + b;
        System.out.println("a + b = " + sum); // ��� a + b = 7

        // ����
        int diff = a - b;
        System.out.println("a - b = " + diff); // ��� a - b = 3

        // ����
        int multi = a * b;
        System.out.println("a * b = " + multi); // ��� a * b = 10

        // ������
        int div = a / b; // int������ ����ϸ� int���� ���� (�Ҽ��� ǥ���� �ȵ�)
        System.out.println("a / b = " + div); // ��� a / b = 2

        // ������
        int mod = a % b;
        System.out.println("a % b = " + mod); // ��� a % b = 1

//        int z = 10 / 0; // 0���� ���� �� �����Ƿ� ���� �߻�
    }
}
