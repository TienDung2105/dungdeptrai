public class bai5 {
    public static void main (String[] args){
        System.out.println("Bang cuu chuong so 5 : ");
        for(int i=1;i<=10;i++)
        {
            System.out.println("5 x "+i+"="+(5*i));
        }

        int TongChanFor =0;
        for(int i=2;i<=100;i+=2)
        {
            TongChanFor+=i;
        }
        System.out.println("Tong cac so chan tu 1 den 100 bang (for) : "+TongChanFor);

        int TongChanWhile =0;
        int j=2;
        while (j<=100){
            TongChanWhile+=j;
            j+=2;
        }
        System.out.println("Tong cac so chan tu 1 den 100 bang (while) : "+TongChanWhile);

    }
}

