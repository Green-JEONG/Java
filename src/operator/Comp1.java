package operator;

public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b); // flase, a�� b�� ���� �ʴ�
        System.out.println(a != b); // ture, a�� b�� �ٸ���
        System.out.println(a > b);  // false, a�� b���� ũ�� �ʴ�
        System.out.println(a < b);  // true, a�� b���� �۴�
        System.out.println(a >= b); // false, a�� b���� ũ�ų� ���� �ʴ�
        System.out.println(a <= b); // true, a�� b���� �۰ų� ����

        //����� bollean ������ ���
        boolean result = a == b;    //a == b: false
        System.out.println(result); //false
    }
}
