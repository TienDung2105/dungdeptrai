import java.util.Scanner;

public class bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        // Xóa khoảng trắng đầu và cuối
        input = input.trim();

        // Đảo chuỗi
        String reversed = new StringBuilder(input).reverse().toString();

        // Kiểm tra đối xứng không phân biệt chữ hoa/thường
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Chuỗi là Palindrome (đối xứng).");
        } else {
            System.out.println("Chuỗi không phải là Palindrome.");
        }

        // Hiển thị chuỗi đảo ngược
        System.out.println("Chuỗi đảo ngược: " + reversed);
    }
}
