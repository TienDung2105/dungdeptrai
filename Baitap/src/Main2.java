public class Main2 {
    public static void main (String[] args){
        Student1 c =new Student1("Dung", 19);

        c.setAge(19);
        c.setName("Bao");

        System.out.println("Ten: "+c.getName());
        System.out.println("Tuoi: "+c.getAge());
    }
}
