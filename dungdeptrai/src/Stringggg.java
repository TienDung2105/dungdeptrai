public class Stringggg {
  public static void main (String[] args) {
    StringBuilder chuoi = new StringBuilder();
    chuoi.append("xin chao,");
    chuoi.append("Toi ten la Dung");

    System.out.println(chuoi);
    chuoi.insert(2,"obama");
    System.out.println(chuoi);
    chuoi.delete(2,7);
    System.out.println(chuoi);
    System.out.println(chuoi.length());

    //Buoi2:
    //Indexof: Kiem tra vi tri xuat hien dau tien cua ky tu hoac chuoi
    // tra ve -1 neu khong tim thay
    String s7 = " toi di tim toi ";
    System.out.println(s7.indexOf("toi"));
    //LastIndexof nguoc lai
    System.out.println(s7.lastIndexOf("toi"));
    //7.7 Contains Kiem tra chuoi con
    String s9 =".mp3";
    String s10= "tuhop.mp3";
    //Ktra s10 co chua s9 khong
    boolean check = s10.contains(s9);
    if(check)
    {
      System.out.println(" Co ");
    }
    else{
      System.out.println("Khong");
    }
    //7.8 Trích loc chuoi con tu chuoi ban dau
    //substring(int beginIndex)
    // substring (int beginIndex, int endIndex)
    String s11  = " abcdefgh ";
    String s12  = s11.substring(4);
    System.out.println(s11);
    System.out.println(s12);
    String s13 = s11.substring(4,7);
    System.out.println(s13);
  }
}
