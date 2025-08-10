public class Car {
    private String brand;
    private int maxSpeed;

    public Car(){

    }

    public Car(String brand, int maxSpeed){
        this.brand=brand;
        this.maxSpeed=maxSpeed;
    }

    void run(){
        System.out.println(" Xe " +brand+ " đang chạy với tốc độ tôi đa " +maxSpeed+" km/h " );
    }
}
