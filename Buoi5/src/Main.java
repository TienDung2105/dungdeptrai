public class Main {
    public static void main(String[] args) {

        Cage cage1 = new Cage("C1");
        Cage cage2 = new Cage("C2");


        Pet pet1 = new Pet("Tom", 5.5, "Cat");
        Pet pet2 = new Pet("Jerry", 2.0, "Mouse");
        Pet pet3 = new Pet("Spike", 15.0, "Dog");
        Pet pet4 = new Pet("Max", 12.3, "Dog");
        Pet pet5 = new Pet("Luna", 8.0, "Cat");


        cage1.addPet(pet1);
        cage1.addPet(pet2);
        cage1.addPet(pet3);

        cage2.addPet(pet4);
        cage2.addPet(pet5);


        System.out.println("\nTotal cages created: " + Cage.totalCages);


        System.out.println("\n--- List of pets in each cage ---");
        cage1.printAllPets();
        cage2.printAllPets();


        System.out.println("\n--- Pets over 10kg ---");
        for (Pet pet : cage1.getPets()) {
            if (pet.isOverweight()) {
                System.out.println(pet.getBasicInfo());
            }
        }
        for (Pet pet : cage2.getPets()) {
            if (pet.isOverweight()) {
                System.out.println(pet.getBasicInfo());
            }
        }
    }
}