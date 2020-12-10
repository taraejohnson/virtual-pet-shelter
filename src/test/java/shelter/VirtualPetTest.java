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
    public void petShouldHaveAName(){
        assertEquals(testPet.getPetName(), PET_NAME);
    }

    @Test
    public void petShouldHaveADescription(){
        assertEquals(testPet.getPetDescription(), PET_DESCRIPTION);
    }

    @Test
    public void petShouldHaveHungerLevel(){
        assertEquals(testPet.getHungerLevel(), HUNGER_LEVEL);
    }

    @Test
    public void petShouldHaveThirstLevel(){
        assertEquals(testPet.getThirstLevel(), THIRST_LEVEL);
    }

    @Test
    public void petShouldHaveBoredomLevel(){
        assertEquals(testPet.getBoredomLevel(), BOREDOM_LEVEL);
    }

    @Test
    public void petShouldBeAbleToEatToDecreaseHunger() {
        int beforeFood = testPet.getHungerLevel();
        testPet.eat();
        int afterFood = testPet.getHungerLevel();
        assertEquals(beforeFood - afterFood, 5);
    }

/*    @Test
    drink*/

/*    @Test
    play*/
}