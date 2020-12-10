package shelter;

/*include appropriate instance variable(s) to store the pets who reside at the shelter
        include methods that:
            return a Collection of all of the pets in the shelter
            return a specific VirtualPet given its name
            allow intake of a homeless pet (adding a pet to the shelter)
            allow adoption of a homeless pet (removing a pet from the shelter)
            feed all of the pets in the shelter
            water all of the pets in the shelter
            plays (or performs some other interaction(s)) with an individual pet in the shelter
            include a tick method that calls the tick method for each of the pets in the shelter, updating their needs*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class VirtualPetShelter {

    Scanner input = new Scanner(System.in);
    private HashMap<String, VirtualPet> virtualShelterPets = new HashMap<>();

    public void intake(VirtualPet virtualPet) {
        virtualShelterPets.put(virtualPet.getPetName(), virtualPet);
    }

    public VirtualPet getVirtualPet(String petName){
        return virtualShelterPets.get(petName);
    }

    public Collection<String> getAllPets() {
        return virtualShelterPets.keySet();
    }

    public int shelterSize() {
        return virtualShelterPets.size();
    }

    public void adopt() {
        System.out.println("Which pet would you like to adopt?");
        String petName = input.nextLine();
        virtualShelterPets.remove(petName);
    }

    public String listOfAllPets(){
        String allPetsString = "";
        for(String i : getAllPets()){
            allPetsString += i + "\n";
        }
        return allPetsString;
    }
}