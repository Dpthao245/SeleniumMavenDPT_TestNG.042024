package BT_JavaBasic3;

public class If_Else  {
    static int  number = 100;

    public static boolean getKetQua (int n) {
        if (n == number) {
            System.out.println("Số " + n + " bằng số" + number);
        }
        if (n < number) {
            System.out.println("Số " + n + " nhỏ hơn số " + number);
        }
        if (n > number) {
            System.out.println("Số " + n + " lớn hơn sô " + number);
        } else {
            System.out.println("Giá trị không hợp lệ.");
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 101;
        System.out.println(getKetQua(n));
    }
}
