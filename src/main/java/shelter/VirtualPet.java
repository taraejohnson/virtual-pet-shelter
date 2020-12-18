package shelter;

public class VirtualPet {
    protected String petName;
    protected String petDescription;
    protected String petType;
    protected int hungerLevel;
    protected int boredomLevel;
    protected int thirstLevel;
    protected int oilLevel;
    protected int maintenanceLevel;
    protected int soilLevel;

    public VirtualPet(String petName, String petDescription, String petType, int hungerLevel, int boredomLevel, int thirstLevel, int soilLevel) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.petType = petType;
        this.hungerLevel = hungerLevel;
        this.boredomLevel = boredomLevel;
        this.thirstLevel = thirstLevel;
        this.soilLevel = soilLevel;
    }

    public VirtualPet(String petName, String petDescription, String petType, int oilLevel, int maintenanceLevel, int boredomLevel) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.petType = petType;
        this.oilLevel = oilLevel;
        this.maintenanceLevel = maintenanceLevel;
        this.boredomLevel = boredomLevel;
    }

    public String getPetName() {
        return petName;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public String getPetType() {
        return petType;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getSoilLevel() {
        return soilLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public void play() {
        boredomLevel += 2;
    }

    public void oil() {
        oilLevel += 2;
    }

    public void maintenance() {
        maintenanceLevel += 2;
    }

    public void eat() {
        hungerLevel += 2;
    }

    public void walk() {
        soilLevel += 2;
        boredomLevel += 2;
        oilLevel -= 2;
        maintenanceLevel -= 2;
    }

    public void drink() {
        thirstLevel += 2;
    }

    public void clean() {
        soilLevel += 2;
    }

    public void tick() {
        oilLevel -= 1;
        maintenanceLevel -= 1;
        hungerLevel -= 1;
        boredomLevel -= 1;
        thirstLevel -= 1;
        soilLevel -= 1;
    }

}