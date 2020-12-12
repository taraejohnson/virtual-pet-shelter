package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {

        VirtualPetShelter myShelter = new VirtualPetShelter();

        //Adding starting pets to shelter
        VirtualPet pet1 = myShelter.intake(new VirtualPet("Zagreus", "Just trying to escape", 50, 50, 50));
        VirtualPet pet2 = myShelter.intake(new VirtualPet("Dusa", "Always cleaning up after everyone", 50, 50, 50));
        VirtualPet pet3 = myShelter.intake(new VirtualPet("Megaera", "Sick of her sisters", 50, 50, 50));
        VirtualPet pet4 = myShelter.intake(new VirtualPet("Eury", "A beautiful singer", 50, 50, 50));

        //Welcome message to user
        System.out.println("Welcome to Hades Pet Shelter! \n");
        System.out.println("Our currently adoptable pets are:\n");
        System.out.println(myShelter.displayPet());

        int choice = 0;

        //User options
        while (choice != 6) {
        System.out.println("How would you like to interact with the pets?");
        System.out.println("1. Feed the pets");
        System.out.println("2. Give the pets fresh water");
        System.out.println("3. Play with the pets");
        System.out.println("4. Adopt a pet");
        System.out.println("5. Surrender a pet to the shelter");
        System.out.println("6. Leave the shelter");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();

            switch (choice) {
                case 1:
                    //feed
                    myShelter.eatCounter();
                    break;
                case 2:
                    //water
                    myShelter.drinkCounter();
                    break;
                case 3:
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
                case 4:
                    //adoption of pets
                    System.out.println("Which pet would you like to adopt?\n");
                    System.out.println(myShelter.petNameAndDescription());
                    Scanner adoptInput = new Scanner(System.in);
                    String petChoice = adoptInput.nextLine();

                    if (petChoice.equalsIgnoreCase(pet1.getPetName())) {
                        myShelter.adopt(pet1);
                    } else if (petChoice.equalsIgnoreCase(pet2.getPetName())) {
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

                case 5:
                    //intake of new pets
                    System.out.println("Please tell us the name of the pet to be surrendered");
                    Scanner intakeInput = new Scanner(System.in);
                    String petIntake = intakeInput.nextLine();
                    System.out.println("Please describe the pet to be surrendered");
                    String petIntake2 = intakeInput.nextLine();
                    VirtualPet surrender = myShelter.intake(new VirtualPet(petIntake, petIntake2, 50, 50 , 50));
                    System.out.println("You've surrendered " + petIntake + " to Hades Pet Shelter.");
                    System.out.println(myShelter.getAllPets() + " are now adoptable \n");
                    break;
            }
            myShelter.tickCounter();
            System.out.println("Name \t|Hunger \t|Thirst \t|Boredom");
            System.out.println("----------------------------------------");
            System.out.println(myShelter.displayPet());
        }
    }
}