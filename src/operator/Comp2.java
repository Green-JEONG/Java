package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "���ڿ�1";
        String str2 = "���ڿ�2";

        boolean result1 = "hello".equals("hello"); //���ͷ� ��
        boolean result2 = str1.equals("���ڿ�1"); //���ڿ� ����, ���ͷ� ��
        boolean result3 = str1.equals(str2);//���ڿ� ���� ��

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println("hello" == "hello"); // � Ư���� ������ ��, ��Ȯ�� ���� ������ ���� �� ����

        System.out.println(result1);    // shift+command+enter ������ �̿ϼ� �ڵ� �ϼ� �� �� ���

    }
}
