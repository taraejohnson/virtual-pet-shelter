package shelter;

public class VirtualPet {
    protected String petName;
    protected String petDescription;
    private int hungerLevel;
    private int boredomLevel;
    private int thirstLevel;

    public VirtualPet(String petName, String petDescription, int hungerLevel, int boredomLevel, int thirstLevel) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.hungerLevel = hungerLevel;
        this.boredomLevel = boredomLevel;
        this.thirstLevel = thirstLevel;
    }

    public String getPetName() {
        return petName;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public void tick() {
        hungerLevel -= 1;
        boredomLevel -= 1;
        thirstLevel -= 1;
    }

    public void play() {
        boredomLevel += 2;
    }

    public void eat() {
        hungerLevel += 2;
    }

    public void drink() {
        thirstLevel += 2;
    }
}