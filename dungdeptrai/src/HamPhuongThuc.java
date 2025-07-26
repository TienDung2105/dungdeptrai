public class HamPhuongThuc{
    public static void main(String[] args) {
    String kq=GiaiPtBac2(1,2,3);
    String kq1=GiaiPtBac2(1,2,1);
    String kq2=GiaiPtBac2(1,2,-3);
    System.out.println(kq);
    System.out.println(kq1);
    System.out.println(kq2);
    }
    public static String GiaiPtBac2(double a, double b, double c){
        if (a==0) {
            if (b == 0 && c == 0) {
                return "Phuong tring bac 1 co vo so nghiem ";
            } else if (b == 0 && c != 0) {
                return "Phuong trinh khong co nghiem ";
            } else {
                return "Phuong trinh co nghiem duy nhat x=" + (-c / b);
            }
        }
        else{
            double delta=(b*b)-4*a*c;
            if(delta<0){
                return "Phuong trinh vo nghiem ";
            }
            else if (delta ==0){
                return "Phuong trinh co nghiem kep x1=x2 ="+(-b/(2*a));
            }
            else{
                double x1=(-b+Math.sqrt(delta))/2*a;
                double x2=(-b-Math.sqrt(delta))/2*a;
                return "Phuong trinh co 2 nghiem pb x1 = "+x1+"x2="+x2;
            }
            }

        }
    }
