package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    VirtualPetShelter testShelter = new VirtualPetShelter();
    public static final String PET_NAME = "Zagreus";
    public static final String PET_DESCRIPTION = "Just trying to escape";
    public static final int HUNGER_LEVEL = 50;
    public static final int THIRST_LEVEL = 50;
    public static final int BOREDOM_LEVEL = 50;
    VirtualPet testPet = new VirtualPet(PET_NAME, PET_DESCRIPTION, 50, 50, 50);

    @Test
    public void shouldBeAbleToIntakePet(){
        testShelter.intake(testPet);
        int result = testShelter.shelterSize();
        assertEquals(result, 1);
    }

    @Test
    public void shouldBeAbleToAdoptPet(){
        testShelter.adopt();
        int result = testShelter.shelterSize();
        assertEquals(result, 0);
    }
}
