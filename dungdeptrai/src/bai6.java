import java.util.Scanner;

class Student {
    String ten;
    int tuoi;
    double gpa;
}

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng sinh viên
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine(); // Xử lý xuống dòng sau khi nhập số

        Student[] students = new Student[n];

        // Nhập thông tin từng sinh viên
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("\nNhap thong tin sinh vien thu " + (i + 1));

            System.out.print("Ten: ");
            students[i].ten = sc.nextLine();

            System.out.print("Tuoi: ");
            students[i].tuoi = sc.nextInt();

            System.out.print("Diem trung binh: ");
            students[i].gpa = sc.nextDouble();
            sc.nextLine(); // Đọc bỏ dòng mới
        }

        // In danh sách sinh viên
        System.out.println("\n--- Danh sach sinh vien ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien " + (i + 1) + ": " + students[i].ten + " - Tuoi: " + students[i].tuoi + " - GPA: " + students[i].gpa);
        }

        // Tính điểm trung bình của cả lớp
        double tongGpa = 0;
        for (int i = 0; i < n; i++) {
            tongGpa += students[i].gpa;
        }
        double gpaTB = tongGpa / n;
        System.out.printf("\nDiem trung binh cua ca lop: %.2f\n", gpaTB);

        // Tìm sinh viên có GPA cao nhất
        double maxGpa = students[0].gpa;
        int indexMax = 0;
        for (int i = 1; i < n; i++) {
            if (students[i].gpa > maxGpa) {
                maxGpa = students[i].gpa;
                indexMax = i;
            }
        }

        System.out.println("\nSinh vien co diem cao nhat: " + students[indexMax].ten + " - GPA: " + students[indexMax].gpa);

        sc.close();
    }
}
