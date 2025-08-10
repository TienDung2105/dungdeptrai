import java.util.ArrayList;

public class Cage {
    private String cageCode;
    private ArrayList<Pet> pets;
    private int currentPetCount;
    public static int totalCages = 0;
    private final int MAX_CAPACITY = 3;


    public Cage(String cageCode) {
        this.cageCode = cageCode;
        this.pets = new ArrayList<>();
        this.currentPetCount = 0;
        totalCages++;
    }


    public void addPet(Pet pet) {
        if (currentPetCount < MAX_CAPACITY) {
            pets.add(pet);
            currentPetCount++;
            System.out.println("Added " + pet.getBasicInfo() + " to cage " + cageCode);
        } else {
            System.out.println("Cage " + cageCode + " is full!");
        }
    }


    public void printAllPets() {
        System.out.println("Cage " + cageCode + " has " + currentPetCount + " pets:");
        for (Pet pet : pets) {
            pet.printInfo();
        }
    }


    public ArrayList<Pet> getPets() {
        return pets;
    }
}