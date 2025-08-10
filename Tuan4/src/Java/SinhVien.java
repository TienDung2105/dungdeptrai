package Java;

public class SinhVien {
    private String MaSinhVien;
    public String Name;
    protected int Age;
    int diem;a

    public SinhVien(){

    }
    public SinhVien(String MaSinhVien, String Name, int Age, int diem){
        this.MaSinhVien= MaSinhVien;
        this.Name=Name;
        this.Age=Age;
        this.diem=diem;
    }
    public String getMaSinhVien(){
        return MaSinhVien= MaSinhVien;
    }
    public void setMaSinhVien(String MaSinHVien){

        this.MaSinhVien=MaSinHVien;
    }
}
