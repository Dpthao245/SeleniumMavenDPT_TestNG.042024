package BT_JavaBasic4;

public class For_Array {
    public static void main(String[] args) {

        // Tạo vòng lặp FOR để in ra các số chẵn từ 0 đến 50

        System.out.println("Các số chẵn từ 0 đến 50: ");

        for (int i = 0; i <= 50; i ++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Tạo mảng để lưu những số chẵn đó vào

        int arr[] = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50};

        // Duyệt mảng để in ra kết quả sau khi nạp vào

        System.out.println("Các số chẵn trong mảng: ");

        for (int i : arr){
            System.out.println(i);
        }
    }
}
