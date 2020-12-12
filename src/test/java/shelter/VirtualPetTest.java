package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetTest {
    public static final String PET_NAME = "Zagreus";
    public static final String PET_DESCRIPTION = "Just trying to escape";
    public static final int HUNGER_LEVEL = 50;
    public static final int THIRST_LEVEL = 50;
    public static final int BOREDOM_LEVEL = 50;
    VirtualPet testPet = new VirtualPet(PET_NAME, PET_DESCRIPTION, 50, 50, 50);

    @Test
    public void petShouldHaveAName() {
        assertEquals(PET_NAME, testPet.getPetName());
    }

    @Test
    public void petShouldHaveADescription() {
        assertEquals(PET_DESCRIPTION, testPet.getPetDescription());
    }

    @Test
    public void petShouldHaveHungerLevel() {
        assertEquals(HUNGER_LEVEL, testPet.getHungerLevel());
    }

    @Test
    public void petShouldHaveThirstLevel() {
        assertEquals(THIRST_LEVEL, testPet.getThirstLevel());
    }

    @Test
    public void petShouldHaveBoredomLevel() {
        assertEquals(BOREDOM_LEVEL, testPet.getBoredomLevel());
    }

    @Test
    public void playMethodShouldAddToBoredomLevel() {
        testPet.play();
        assertEquals(52, testPet.getBoredomLevel());
    }

    @Test
    public void eatMethodShouldAddToHungerLevel() {
        testPet.eat();
        assertEquals(52, testPet.getHungerLevel());
    }

    @Test
    public void drinkMethodShouldAddToThirstLevel() {
        testPet.drink();
        assertEquals(52, testPet.getThirstLevel());
    }
}