package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

public class VirtualPetShelter {

    private HashMap<String, VirtualPet> virtualShelterPets = new HashMap<>();

    public String displayPet() {
        String iteration = "";
        for (Entry<String, VirtualPet> displayPetName : virtualShelterPets.entrySet()) {
            if (displayPetName.getValue().getPetType().equalsIgnoreCase("Organic")) {
                iteration += displayPetName.getValue().getPetName() + "\t|" + displayPetName.getValue().getPetType() + "\t|" + displayPetName.getValue().getHungerLevel() +
                        "\t\t\t\t|" + displayPetName.getValue().getThirstLevel() + "\t\t\t\t\t\t|" + displayPetName.getValue().getBoredomLevel() +
                        "\t\t\t|" + displayPetName.getValue().getSoilLevel() + "\n";
            } else if (displayPetName.getValue().getPetType().equalsIgnoreCase("Robotic")) {
                iteration += displayPetName.getValue().getPetName() + "\t|" + displayPetName.getValue().getPetType() + "\t|" + displayPetName.getValue().getOilLevel() +
                        "\t\t\t\t|" + displayPetName.getValue().getMaintenanceLevel() + "\t\t\t\t\t\t|" + displayPetName.getValue().getBoredomLevel() +
                        "\t\t\t|--" + "\n";
            }
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
        virtualShelterPets.remove(VirtualPet.petName);
        System.out.println("Congrats! You've adopted " + VirtualPet.petName);
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
    }

    public void drinkCounter() {
        for (Entry<String, VirtualPet> tickUp : virtualShelterPets.entrySet()) {
            tickUp.getValue().drink();
        }
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

    public void oilCounter() {
        for (Entry<String, VirtualPet> tickUp : virtualShelterPets.entrySet()) {
            tickUp.getValue().oil();
        }
    }

    public void maintenanceCounter() {
        for (Entry<String, VirtualPet> tickUp : virtualShelterPets.entrySet()) {
            tickUp.getValue().maintenance();
        }
    }

    public void cleanCounter() {
        for (Entry<String, VirtualPet> tickUp : virtualShelterPets.entrySet()) {
            tickUp.getValue().clean();
        }
    }

    public void walkCounter() {
        for (Entry<String, VirtualPet> tickUp : virtualShelterPets.entrySet()) {
            tickUp.getValue().walk();
        }
    }
}
