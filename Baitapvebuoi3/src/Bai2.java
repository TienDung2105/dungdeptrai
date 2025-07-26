import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();


        if (laDoiXung(input)) {

            System.out.println(input.toUpperCase());
            System.out.println("Chuỗi này đối xứng.");
        } else {

            System.out.println(input.toLowerCase());
            System.out.println("Chuỗi này không đối xứng.");
        }
    }


    public static boolean laDoiXung(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
