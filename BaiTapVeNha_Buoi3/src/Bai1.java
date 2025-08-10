import java.util.Scanner;

public class Bai1 {
    public static int isPrime(int n) {
        if (n<2) return 0;
        for (int i=2; i<=Math.sqrt(n); i++)
            if (n%i==0)
                return 0;
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int sumOfEven = 0;
        int sumOfOdd = 0;
        int count = 0;
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            int check = isPrime(arr[i]);
            if (arr[i] % 2 == 0) {
                sumOfEven += arr[i];
            } else if (arr[i] % 2 != 0) {
                sumOfOdd += arr[i];
            } else if ((boolean)check) {
                count++;
            }
        }

        System.out.println("Tong cac so chan: " + sumOfEven);
        System.out.println("Tong cac so le: " + sumOfOdd);
        System.out.println("So luong cac so nguyen to: " + count);

    }
}