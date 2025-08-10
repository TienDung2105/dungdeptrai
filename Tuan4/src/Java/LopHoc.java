package Java;

public class LopHoc extends SinhVien {
    public static void main (String[] args) {
        SinhVien b = new SinhVien();
        b.Age = 15;
        SinhVien c = new SinhVien("2024605872","Dũng Đẹp Trai Vc",19,100);
        System.out.println(c.Name);
        System.out.println(c.Age);
        System.out.println(c.diem);
    }
}
