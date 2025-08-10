package bai2;

public class Main {
    public static void main (String[] args){
        Student c =new Student ("Dung", 19);

        c.setAge(19);
        c.setName("Bao");

        System.out.println("Ten: "+c.getName());
        System.out.println("Tuoi: "+c.getAge());
    }
}
