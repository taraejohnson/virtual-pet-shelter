package shelter;

/*Create a main method that…
        implements a game loop.
        asks for user input.
        writes output to the console.
        calls VirtualPetShelter’s tick method after each interaction

Available user interface actions should include (at minimum)…
        feeding all the pets
        watering all the pets
        playing with an individual pet, which should display a list of pet names and descriptions, allowing a user to select one
        allow adoption of a pet, which should display a list of pet names and descriptions, allowing a user to select one.
        allow intake of a pet, prompting the user for the pet’s information, requiring the user to (at minimum) specify name and description*/

public class VirtualPetShelterApp {

    public static void main(String[] args) {

        VirtualPetShelter myShelter = new VirtualPetShelter();

        VirtualPet pet1 = new VirtualPet("Zagreus", "Just trying to escape", 50, 50, 50);
        VirtualPet pet2 = new VirtualPet("Dusa", "Always cleaning up after everyone", 50, 50, 50);
        VirtualPet pet3 = new VirtualPet("Megaera", "Sick of her sisters", 50, 50, 50);
        VirtualPet pet4 = new VirtualPet("Eurydice", "A beautiful singer and a natural homemaker", 50, 50, 50);

        myShelter.intake(pet1);
        myShelter.intake(pet2);
        myShelter.intake(pet3);
        myShelter.intake(pet4);

        System.out.println("Name \t|Hunger \t|Thirst \t|Boredom");
        System.out.println("----------------------------------------");
        System.out.println(pet1.getPetName() + "\t|" + pet1.getHungerLevel() + "\t\t\t|" + pet1.getThirstLevel() + "\t\t\t|" + pet1.getBoredomLevel());
        System.out.println(pet2.getPetName() + "\t|" + pet2.getHungerLevel() + "\t\t\t|" + pet2.getThirstLevel() + "\t\t\t|" + pet2.getBoredomLevel());
        System.out.println(pet3.getPetName() + "\t|" + pet3.getHungerLevel() + "\t\t\t|" + pet3.getThirstLevel() + "\t\t\t|" + pet3.getBoredomLevel());
        System.out.println(pet4.getPetName() + "|" + pet4.getHungerLevel() + "\t\t\t|" + pet4.getThirstLevel() + "\t\t\t|" + pet4.getBoredomLevel());

    }
}