class Student {
    String name;
    Student(String name) { this.name = name; }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("A");
        students[1] = new Student("B");
        students[2] = new Student("C");
    }
}
