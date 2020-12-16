package shelter;

public abstract class OrganicPet extends VirtualPet{
    public OrganicPet(String petName, String petDescription, int hungerLevel, int boredomLevel, int thirstLevel) {
        super(petName, petDescription, hungerLevel, boredomLevel, thirstLevel);
    }

    public void orgTick() {
        hungerLevel -= 1;
        boredomLevel -= 1;
        thirstLevel -= 1;
    }

}
