package shelter;

/*include instance variables representing:
        name (from the above example, this might be 'Tommy')
        description (from the above example, this might be 'smells like a Stargazer lily fresh with morning dew')
        include a constructor that accepts a name and description
        include a constructor that, in addition to name and description, accepts default values for the pet’s attributes
        (hunger, boredom, etc)
        Do not include a default (zero arguments) constructor.*/

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

    public int eat(){
        return hungerLevel++;
    }
}