import java.util.Scanner;

public class Bai1 {

    public static final String SQUARE = "Square";
    public static final String TRIANGLE = "Triangle";
    public static final String CIRCLE = "Circle";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập loại hình (Square, Triangle, Circle): ");
        String type = sc.nextLine();


        tinhDienTich(type, sc);
    }
    public static void tinhDienTich(String type, Scanner sc) {
        switch (type) {
            case SQUARE:
                System.out.print("Nhập độ dài cạnh hình vuông: ");
                double canh = sc.nextDouble();
                System.out.println("Diện tích hình vuông: " + tinhDienTichSquare(canh));
                break;
            case TRIANGLE:
                System.out.print("Nhập cạnh a: ");
                double a = sc.nextDouble();
                System.out.print("Nhập cạnh b: ");
                double b = sc.nextDouble();
                System.out.print("Nhập cạnh c: ");
                double c = sc.nextDouble();
                System.out.println("Diện tích tam giác: " + tinhDienTichTriangle(a,b,c));
                break;
            case CIRCLE:
                System.out.print("Nhập bán kính: ");
                double r = sc.nextDouble();
                System.out.println("Diện tích hình tròn: " + tinhDienTichCircle(r));
                break;
            default:
                System.out.println("Hình dạng không hợp lệ!");
        }
    }


    public static double tinhDienTichSquare(double canh) {

        return canh * canh;
    }


    public static double tinhDienTichTriangle(double a, double b, double c) {
        double s=(a+b+c)/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }


    public static double tinhDienTichCircle(double r) {

        return Math.PI * r * r;
    }
}
