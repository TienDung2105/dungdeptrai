import java.util.Scanner;

public class bai01 {
    public static Scanner sc = new Scanner(System.in);
    public static int [] enterArray(){
        System.out.println("Nhao vao so luong phan tu cua mang:  ");
        int n =sc.nextInt();
        int [] arr=new int [n];

        System.out.println("Nhap cac phan tu cua mang : ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        return arr;
    }
    public static void printArray(int []a, int n){
        System.out.println("------Mang------");
        for (int i=0;i<n;i++){
            System.out.println(a[i]+ " ");
        }
        System.out.println();
    }
    public static void oddEven(int[] a, int n) {
        int tongChan = 0, tongLe = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0)
                tongChan += a[i];
            else
                tongLe += a[i];
        }
        System.out.println("Tổng các số chẵn: " + tongChan);
        System.out.println("Tổng các số lẻ: " + tongLe);
    }
    public static boolean checkPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
    public static void slPrime(int[] a, int n) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (checkPrime(a[i])) {
                dem++;
            }
        }
        System.out.println("Số lượng số nguyên tố trong mảng: " + dem);
    }
    public static void main(String[] args) {
        int []arr=enterArray();
        int n= arr.length;
        printArray(arr,n);
        oddEven(arr,n);
        slPrime(arr,n);
    }
}
