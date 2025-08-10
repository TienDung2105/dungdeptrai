package baitapvenha;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-------- Quản lý sinh viên --------");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Sắp xếp sinh viên theo tuổi");
            System.out.println("4. Sắp xếp sinh viên theo GPA");
            System.out.println("5. Sắp xếp sinh viên theo số tiết nghỉ");
            System.out.println("6. Xóa sinh viên khỏi danh sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> updateStudent();
                case 3 -> {
                    students.sort(Comparator.comparing(Student::getAge));
                    showAll();
                }
                case 4 -> {
                    students.sort((Student s1, Student s2) -> Double.compare(s2.getGPA(), s1.getGPA()));
                    showAll();
                }
                case 5 -> {
                    students.sort(Comparator.comparing(Student::getAbsentDays));
                    showAll();
                }
                case 6 -> deleteStudent();
                case 0 -> System.exit(0);
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }


    public static void addStudent() {
        System.out.print("Tên: ");
        String name = sc.nextLine();
        System.out.print("Năm sinh: ");
        int year = sc.nextInt(); sc.nextLine();
        System.out.print("Địa chỉ: ");
        String address = sc.nextLine();
        System.out.print("Điểm TX1: ");
        double tx1 = sc.nextDouble();
        System.out.print("Điểm TX2: ");
        double tx2 = sc.nextDouble();
        System.out.print("Điểm KTHP: ");
        double kthp = sc.nextDouble();
        System.out.print("Số tiết nghỉ: ");
        int absent = sc.nextInt(); sc.nextLine();

        Student s = new Student(name, year, address, tx1, tx2, kthp, absent);
        students.add(s);
        System.out.println("=> Thêm thành công.");
    }

    public static void updateStudent() {
        System.out.print("Nhập tên sinh viên cần sửa: ");
        String name = sc.nextLine();
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println("==> Nhập thông tin mới:");
                System.out.print("Năm sinh: ");
                s.setBirthYear(sc.nextInt()); sc.nextLine();
                System.out.print("Địa chỉ: ");
                s.setAddress(sc.nextLine());
                System.out.print("Điểm TX1: ");
                s.setTx1(sc.nextDouble());
                System.out.print("Điểm TX2: ");
                s.setTx2(sc.nextDouble());
                System.out.print("Điểm KTHP: ");
                s.setKthp(sc.nextDouble());
                System.out.print("Số tiết nghỉ: ");
                s.setAbsentDays(sc.nextInt()); sc.nextLine();
                System.out.println("=> Cập nhật thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên.");
    }

    public static void deleteStudent() {
        System.out.print("Nhập tên sinh viên cần xóa: ");
        String name = sc.nextLine();
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            if (it.next().getName().equalsIgnoreCase(name)) {
                it.remove();
                System.out.println("=> Đã xóa.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên.");
    }

    public static void showAll() {
        System.out.printf("%-10s %-5s %-15s %-8s %-8s %-10s %-8s %-5s\n",
                "Tên", "Tuổi", "Địa chỉ", "TX1", "TX2", "KTHP", "GPA", "Nghỉ");
        for (Student s : students) {
            s.showInfo();
        }
    }

}
