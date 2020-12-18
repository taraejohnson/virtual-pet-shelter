package shelter;

public abstract class OrganicPet extends VirtualPet {

    public OrganicPet(String petName, String petDescription, String petType, int hungerLevel, int boredomLevel, int thirstLevel, int soilLevel) {
        super(petName, petDescription, petType, hungerLevel, boredomLevel, thirstLevel, soilLevel);
    }
}
