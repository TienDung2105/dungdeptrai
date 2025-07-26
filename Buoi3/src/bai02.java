import java.util.Scanner;

public class bai02 {

    public static final double PI = 3.14159265;

    // Hàm tính chu vi hình tròn
    public static double chuVi(double r) {
        return 2 * PI * r;
    }

    // Hàm tính diện tích hình tròn
    public static double dienTich(double r) {
        return PI * r * r;
    }

    // Hàm tính r mũ k
    public static double luyThua(double r, int k) {
        return Math.pow(r, k);
    }

    // Hàm tính căn bậc hai của (r + k)
    public static double canBacHai(double r, int k) {
        return Math.sqrt(r + k);
    }

    // Hàm tính giá trị tuyệt đối của (r - k)
    public static double giaTriTuyetDoi(double r, int k) {
        return Math.abs(r - k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập bán kính r = ");
        double r = sc.nextDouble();

        System.out.print("Nhập số mũ k = ");
        int k = sc.nextInt();

        System.out.println("\n--- Kết quả ---");
        System.out.println("Chu vi hình tròn: " + chuVi(r));
        System.out.println("Diện tích hình tròn: " + dienTich(r));
        System.out.println("r mũ k: " + luyThua(r, k));
        System.out.println("Căn bậc hai của (r + k): " + canBacHai(r, k));
        System.out.println("Giá trị tuyệt đối của (r - k): " + giaTriTuyetDoi(r, k));
    }
}
