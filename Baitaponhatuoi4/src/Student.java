public class Student {
    private String name;
    private int YearofBirth;
    private String address;
    private double tx1;
    private double tx2;
    private double KTHP;
    private int sotietnghi;

    public Student() {

    }

    public Student(String name, int YearofBirth, String address, double tx1, double tx2, double KTHP, int sotietnghi) {
        this.name = name;
        this.YearofBirth = YearofBirth;
        this.address = address;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.KTHP = KTHP;
        this.sotietnghi = sotietnghi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearofBirth() {
        return YearofBirth;
    }

    public void setYearofBirth(int yearofBirth) {
        YearofBirth = yearofBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getTx1() {
        return tx1;
    }

    public void setTx1(double tx1) {
        this.tx1 = tx1;
    }

    public double getTx2() {
        return tx2;
    }

    public void setTx2(double tx2) {
        this.tx2 = tx2;
    }

    public double getKTHP() {
        return KTHP;
    }

    public void setKTHP(double KTHP) {
        this.KTHP = KTHP;
    }

    public int getSotietnghi() {
        return sotietnghi;
    }

    public void setSotietnghi(int sotietnghi){
        this.sotietnghi = sotietnghi;
    }
    public int getage (){
        return java.time.Year.now().getValue()-getYearofBirth();
    }
    public double getGPA(){
        return tx1*0.2+tx2*0.3+KTHP*0.5;
    }
}
