//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student[] a = new Student[5];
        a[0] = new Student("Dung", 2006, "Phu Tho", 10, 10, 9, 2);
        a[1] = new Student("Bao", 2006, "Nam Dinh", 10, 9, 9, 1);
        a[2] = new Student("Dat", 2006, "Ha Noi", 9, 9, 9, 3);

        System.out.printf("%-10s%-8s%-15s%-12s%-12s%-15s%-10s%-12s\n",
                "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "GPA", "Số tiết nghỉ");

        for (Student s : a) {
            System.out.printf("%-10s%-8d%-15s%-12.2f%-12.2f%-15.2f%-10.2f%-12d\n",
                    s.getName(), s.getage(), s.getAddress(), s.getTx1(), s.getTx2(), s.getKTHP(), s.getGPA(), s.getSotietnghi());
        }
    }
}