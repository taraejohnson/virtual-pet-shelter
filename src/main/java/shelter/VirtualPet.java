package shelter;

public class VirtualPet {
    protected String petName;
    protected String petDescription;
    protected int hungerLevel;
    protected int boredomLevel;
    protected int thirstLevel;
    protected int oilLevel;
    protected int maintenanceLevel;
    protected int soilLevel;

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

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public void play() {
        boredomLevel += 2;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getSoilLevel(){
        return soilLevel;
    }

    public int getOilLevel(){
        return oilLevel;
    }

    public int getMaintenanceLevel(){
        return maintenanceLevel;
    }

    public void oil(){
        oilLevel++;
    }

    public void maintenance(){
        maintenanceLevel++;
    }

    public void eat() {
        hungerLevel += 2;
    }

    public void drink() {
        thirstLevel += 2;
    }

    public void clean(){
        soilLevel++;
    }

}