package BT_JavaBasic3;

public class ToanTu {

    static int a = 100;
    static int b = 34;
    static int c = 85;


    public static void main(String[] args) {

        boolean KetQua1 = a < b;
        System.out.println("a < b: " + KetQua1);

        boolean KetQua2 = c > b;
        System.out.println("c > b: " + KetQua2);

        boolean KetQua3 = a == (b + c);
        System.out.println("a = b + c: " + KetQua3);

        boolean KetQua4 = (a > b) && (b < c);
        System.out.println("(a > b) và (b < c): " + KetQua4);

        boolean KetQua5 = (a < c) || (a < (b + c));
        System.out.println("(a < c) hoặc (a < (b + c)): " + KetQua5);

    }
}
