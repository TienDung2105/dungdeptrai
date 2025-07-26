import java.util.Scanner;

public class bai3 {
    public static void main(String[] args){
        Scanner td = new Scanner (System.in);

        for (int i=1;i<=5;i++)
        {
            System.out.println("Lan thu "+i+":");

            System.out.print("Nhap so nguyen thu nhat: ");
            int a= td.nextInt();

            System.out.print("Nhap so nguyen thu hai:");
            int b= td.nextInt();

            System.out.println("Tong"+(a+b));
            System.out.println("Hieu"+(a-b));
            System.out.println("Tich"+(a*b));
            if (b!=0)
            {
                System.out.println("Thuong"+(a/b));
                System.out.println("Chia lay du"+(a%b));
            }
            else{
                System.out.println("Khong the chia hoac chia lat du vi co mau so bang 0");

            }
            if(a==b)
            {
                System.out.println("Hai so bang nhau");
            }else{
                System.out.println("Hai so khong bang nhau");
            }
        }
        td.close();
    }
}
