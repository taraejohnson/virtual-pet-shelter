package shelter;

public abstract class RoboticPet extends VirtualPet{

    public RoboticPet(String petName, String petDescription, int oilLevel, int boredomLevel, int maintenanceLevel) {
        super(petName, petDescription, oilLevel, boredomLevel, maintenanceLevel);
    }

    public void robotTick(){
        oilLevel -= 1;
        maintenanceLevel -= 1;
    }
}
