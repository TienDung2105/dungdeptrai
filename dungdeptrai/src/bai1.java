import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Nhập tên: ");
        String ten = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int tuoi = sc.nextInt();

        System.out.print("Nhập chiều cao (mét): ");
        double chieuCao = sc.nextDouble();

        // Xuất thông tin
        System.out.println("Xin chào " + ten + ", bạn " + tuoi + " tuổi và cao " + chieuCao + " mét.");
    }
}


