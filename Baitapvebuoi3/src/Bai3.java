import java.util.Scanner;

public class Bai3   {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=(int)(Math.random()*100);
        int b =(int)(Math.random()*100);
        boolean dung=Math.random()<0.5;
        int c;
        if (dung)
            c=a+b;
        else
            do {
                c =(int)(Math.random()*200);
            }while (c==a+b);
        System.out.println(a+"+"+b+"="+c);
        System.out.println("phép tính đúng hay phép tính sai");
        String doan= sc.nextLine();
        if (a + b == c){
            if (doan.equalsIgnoreCase("phép tính đúng"))
                System.out.println("Bạn đã trời đúng");

            else
                System.out.println("Bạn đã trả lời sai");}
        else{
            if (doan.equalsIgnoreCase("phép tính sai"))
                System.out.println("Bạn đã trời đúng");
            else
                System.out.println("Bạn đã trả lời sai");
        }

    }
}