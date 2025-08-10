package baitapvenha;

public class Student {
    private String name;
    private int birthYear;
    private String address;
    private double tx1;
    private double tx2;
    private double kthp;
    private int absentDays;

    public Student(String name, int birthYear, String address, double tx1, double tx2, double kthp, int absentDays) {
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.kthp = kthp;
        this.absentDays = absentDays;
    }

    public int getAge() {
        return 2025 - birthYear;
    }

    public double getGPA() {
        return tx1 * 0.2 + tx2 * 0.3 + kthp * 0.5;
    }

    // Getter + Setter (nếu cần)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getBirthYear() { return birthYear; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public double getTx1() { return tx1; }
    public void setTx1(double tx1) { this.tx1 = tx1; }

    public double getTx2() { return tx2; }
    public void setTx2(double tx2) { this.tx2 = tx2; }

    public double getKthp() { return kthp; }
    public void setKthp(double kthp) { this.kthp = kthp; }

    public int getAbsentDays() { return absentDays; }
    public void setAbsentDays(int absentDays) { this.absentDays = absentDays; }

    public void showInfo() {
        System.out.printf("%-10s %-5d %-15s %-8.1f %-8.1f %-10.1f %-8.2f %-5d\n",
                name, getAge(), address, tx1, tx2, kthp, getGPA(), absentDays);
    }
}

