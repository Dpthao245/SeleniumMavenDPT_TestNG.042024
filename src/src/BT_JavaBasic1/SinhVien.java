package BT_JavaBasic1;

public class SinhVien {

    //Biến static
    static String name = "Dương Phương Thảo";
    static String email = "dpthao245@gmail.com";
    static String MSSSV = "MSSV001";

    //Biến toàn cục
    String address = "Thành phố Cần Thơ";

    public void getInfor() {
        int age = 30; //Biến cục bộ
        System.out.println("Tuổi : " + age);
        System.out.println("Địa chỉ: " + address);
    }

    public static void main(String[] args) {
        String phone = "012345678";

        System.out.println("Thông tin sinh viên:");
        System.out.println("Tên sinh viên: " + name);
        System.out.println("email: " + email);
        System.out.println("Số điện thoại: " + phone);
    }
}
