package operator;

public class Operator2 {

    public static void main(String[] args) {

        //���ڿ��� ���ڿ� ���ϱ�1
        String result1 = "hello " + "world";
        System.out.println(result1);

        //���ڿ��� ���ڿ� ���ϱ�2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        //���ڿ��� ���� ���ϱ�1
        String result3 = "a + b = " + 10; //���ڿ� ���ڸ� ���ϸ� �ڵ����� ���ڸ� ���ڿ��� �ٲ��� ��µ�
        System.out.println(result3);

        //���ڿ��� ���� ���ϱ�2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
    }
}
