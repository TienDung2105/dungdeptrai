import java.util.Scanner;

public class bai4 {
    public static void main (String[] args) {
        Scanner td = new Scanner(System.in);
        int[] arr =new int[5];
        int tong = 0;
        int max;

        System.out.println("Nhap 5 so nguyen");
        for(int i=0;i< arr.length ;i++)
        {
            System.out.print("So thu "+(i+1)+" : ");
            arr[i]=td.nextInt();
            tong+=arr[i];
        }

        System.out.print("Cac phan tu vua nhap : ");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        max= arr[0];
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("\n Tong cac phan tu : "+tong);
        System.out.println("Gia tri lon nhat : "+max);

        td.close();
    }
}
