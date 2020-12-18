package shelter;

import java.awt.*;
import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {

        VirtualPetShelter myShelter = new VirtualPetShelter();

        //Adding starting pets to shelter
        VirtualPet pet1 = myShelter.intake(new RoboticDog("Zagreus", "Just trying to escape", "Robotic", 50, 50, 50));
        VirtualPet pet2 = myShelter.intake(new RoboticCat("Dusa", "Always cleaning up after everyone", "Robotic", 50, 50, 50));
        VirtualPet pet3 = myShelter.intake(new OrganicDog("Megaera", "Sick of her sisters", "Organic", 50, 50, 50, 50));
        VirtualPet pet4 = myShelter.intake(new OrganicCat("Eury", "A beautiful singer", "Organic", 50, 50, 50, 50));

        //Welcome message to user
        System.out.println("Welcome to Hades Pet Shelter! \n");
        System.out.println("Our currently adoptable pets are:\n");
        System.out.println("Name \t|Type \t\t|Hunger/Oil \t|Thirst/Maintenance \t|Boredom \t|Cleanliness");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(myShelter.displayPet());

        int choice = 0;

        //User options
        while (choice != 10) {
            System.out.println("How would you like to interact with the pets?");
            System.out.println("1. Feed the organic pets");
            System.out.println("2. Give the organic pets fresh water");
            System.out.println("3. Give robotic pets oil");
            System.out.println("4. Do maintenance on robotic pets");
            System.out.println("5. Play with the pets");
            System.out.println("6. Clean up after pets");
            System.out.println("7. Take the pets on a walk");
            System.out.println("8. Adopt a pet");
            System.out.println("9. Surrender a pet to the shelter");
            System.out.println("10. Leave the shelter");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    //feed
                    myShelter.eatCounter();
                    System.out.println("You've fed the pets! \n");
                    break;
                case 2:
                    //water
                    myShelter.drinkCounter();
                    System.out.println("You've given the pets fresh water! \n");
                    break;
                case 3:
                    //oil
                    myShelter.oilCounter();
                    System.out.println("You've oiled the robotic pets! They're feeling less squeaky! \n");
                    break;
                case 4:
                    //maintenance
                    myShelter.maintenanceCounter();
                    break;
                case 5:
                    //play
                    System.out.println(myShelter.petNameAndDescription());
                    System.out.println("Which pet would you like to play with?");
                    Scanner playInput = new Scanner(System.in);
                    String playChoice = playInput.nextLine();
                    if (playChoice.equalsIgnoreCase(pet1.getPetName())) {
                        myShelter.playCounter(pet1);
                    } else if (playChoice.equalsIgnoreCase(pet2.getPetName())) {
                        myShelter.playCounter(pet2);
                    } else if (playChoice.equalsIgnoreCase(pet3.getPetName())) {
                        myShelter.playCounter(pet3);
                    } else if (playChoice.equalsIgnoreCase(pet4.getPetName())) {
                        myShelter.playCounter(pet4);
                    } else {
                        System.out.println("Uh oh! Pet does not exist, or isn't ready to play right now. \n");
                        break;
                    }
                    break;
                case 6:
                    //clean
                    myShelter.cleanCounter();
                    break;
                case 7:
                    //walk
                    myShelter.walkCounter();
                    break;
                case 8:
                    //adoption of pets
                    System.out.println("Which pet would you like to adopt?\n");
                    System.out.println(myShelter.petNameAndDescription());
                    Scanner adoptInput = new Scanner(System.in);
                    String petChoice = adoptInput.nextLine();


                    if (petChoice.equalsIgnoreCase(pet1.petName)) {
                        myShelter.adopt(pet1);
                    } else if (petChoice.equalsIgnoreCase(pet2.petName)) {
                        myShelter.adopt(pet2);
                    } else if (petChoice.equalsIgnoreCase(pet3.getPetName())) {
                        myShelter.adopt(pet3);
                    } else if (petChoice.equalsIgnoreCase(pet4.getPetName())) {
                        myShelter.adopt(pet4);
                    } else {
                        System.out.println("Oh no! Pet does not exist, or is too new to be adopted. \n");
                        break;
                    }
                    break;

                case 9:
                    //intake of new pets
                    System.out.println("Please tell us the name of the pet to be surrendered");
                    Scanner intakeInput = new Scanner(System.in);
                    String petIntake = intakeInput.nextLine();
                    System.out.println("Is this pet organic or robotic?");
                    String petIntake2 = intakeInput.nextLine();
                    System.out.println("Is this pet a cat or a dog?");
                    String petIntake3 = intakeInput.nextLine();
                    System.out.println("Please describe the pet to be surrendered");
                    String petIntake4 = intakeInput.nextLine();

                    if (petIntake2.equalsIgnoreCase("Organic") && petIntake3.equalsIgnoreCase("Dog")) {
                        VirtualPet surrender = myShelter.intake(new OrganicDog(petIntake, petIntake4, petIntake2, 50, 50, 50, 50));

                    } else if (petIntake2.equalsIgnoreCase("Robotic") && petIntake3.equalsIgnoreCase("Dog")) {
                        VirtualPet surrender = myShelter.intake(new RoboticDog(petIntake, petIntake4, petIntake2, 50, 50, 50));

                    } else if (petIntake2.equalsIgnoreCase("Organic") && petIntake3.equalsIgnoreCase("Cat")) {
                        VirtualPet surrender = myShelter.intake(new OrganicCat(petIntake, petIntake4, petIntake2, 50, 50, 50, 50));

                    } else if (petIntake2.equalsIgnoreCase("Robotic") && petIntake3.equalsIgnoreCase("Cat")) {
                        VirtualPet surrender = myShelter.intake(new RoboticCat(petIntake, petIntake4, petIntake2, 50, 50, 50));
                    }

                    System.out.println("You've surrendered " + petIntake + " to Hades Pet Shelter.");
                    System.out.println(myShelter.getAllPets() + " are now adoptable \n");
                    break;
            }
            myShelter.tickCounter();
            System.out.println("Name \t|Type \t\t|Hunger/Oil \t|Thirst/Maintenance \t|Boredom \t|Cleanliness");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(myShelter.displayPet());
        }
    }
}