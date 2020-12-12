package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

public class VirtualPetShelter {

    private HashMap<String, VirtualPet> virtualShelterPets = new HashMap<>();

    public String displayPet() {
        String iteration = "";
        for (Entry<String, VirtualPet> displayPetName : virtualShelterPets.entrySet()) {
            displayPetName.getValue();
            iteration += displayPetName.getValue().getPetName() + "\t|" + displayPetName.getValue().getHungerLevel() +
                    "\t\t\t|" + displayPetName.getValue().getThirstLevel() + "\t\t\t|" + displayPetName.getValue().getBoredomLevel()
                    + "\n";
        }
        return iteration;
    }

    public VirtualPet intake(VirtualPet VirtualPet) {
        virtualShelterPets.put(VirtualPet.getPetName(), VirtualPet);
        return VirtualPet;
    }

    public Collection<String> getAllPets() {
        return virtualShelterPets.keySet();
    }

    public int shelterSize() {
        return virtualShelterPets.size();
    }

    public void adopt(VirtualPet VirtualPet) {
        virtualShelterPets.remove(VirtualPet.getPetName());
        System.out.println("Congrats! You've adopted " + VirtualPet.getPetName());
        System.out.println(getAllPets() + " are still adoptable. \n");
    }

    public void tickCounter() {
        for (Entry<String, VirtualPet> tickDown : virtualShelterPets.entrySet()) {
            tickDown.getValue().tick();
        }
    }

    public void eatCounter() {
        for (Entry<String, VirtualPet> tickUp : virtualShelterPets.entrySet()) {
            tickUp.getValue().eat();
        }
        System.out.println("You've fed the pets! \n");
    }

    public void drinkCounter() {
        for (Entry<String, VirtualPet> tickUp : virtualShelterPets.entrySet()) {
            tickUp.getValue().drink();
        }
        System.out.println("You've given the pets fresh water! \n");
    }

    public void playCounter(VirtualPet VirtualPet) {
        VirtualPet.play();
    }

    public String petNameAndDescription() {
        String nameAndDescription = "";
        for (Entry<String, VirtualPet> petsInfo : virtualShelterPets.entrySet()) {
            nameAndDescription += petsInfo.getValue().getPetName() + ": " + petsInfo.getValue().getPetDescription() + "\n";
        }
        return nameAndDescription;
    }
}
