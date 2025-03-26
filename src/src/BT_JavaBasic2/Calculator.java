package BT_JavaBasic2;

public class Calculator {

    public static int getTongHaiSoNguyen (int a, int b){
        return a + b;
    }

    public static float getTongHaiSoThuc (float c, float d){
        return c + d;
    }

    public static void main(String[] args) {
        int TongHaiSoNguyen = getTongHaiSoNguyen(100, 72);
        System.out.println("Tổng hai số nguyên: " + TongHaiSoNguyen);

        float TongHaiSoThuc = getTongHaiSoThuc(11.2F, 342.5F);
        System.out.println("Tổng hai số thực: " + TongHaiSoThuc);


    }
}
