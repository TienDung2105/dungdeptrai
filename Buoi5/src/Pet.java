public class Pet {
    private String name;
    private double weight;
    private String species;


    public Pet(String name, double weight, String species) {
        this.name = name;
        this.weight = weight;
        this.species = species;
    }


    public void printInfo() {
        System.out.println("Name: " + name + ", Species: " + species + ", Weight: " + weight + " kg");
    }


    public boolean isOverweight() {
        return weight > 10;
    }


    public String getBasicInfo() {
        return name + " (" + species + ")";
    }
}