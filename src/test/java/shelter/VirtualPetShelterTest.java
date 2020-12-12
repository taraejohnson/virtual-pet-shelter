package shelter;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    VirtualPetShelter testShelter = new VirtualPetShelter();
    public static final String PET_NAME = "TESTPETTESTPETTESTPET";
    public static final String PET_DESCRIPTION = "I AM JUST A TEST PET";
    public static final int HUNGER_LEVEL = 50;
    public static final int THIRST_LEVEL = 50;
    public static final int BOREDOM_LEVEL = 50;
    private HashMap<String, VirtualPet> testShelterMap = new HashMap<>();
    VirtualPet testPet = new VirtualPet(PET_NAME, PET_DESCRIPTION, HUNGER_LEVEL, THIRST_LEVEL, BOREDOM_LEVEL);
    VirtualPet anotherTestPet = new VirtualPet("ANOTHERTESTPETANOTHERTEST", "I AM ONLY A TEST CHECK CHECK", 50, 50, 50);

    @Test
    public void shouldDisplayPetNameAndStats(){
        testShelter.intake(testPet);
        System.out.println(testShelter.displayPet());
    }

    @Test
    public void shouldBeAbleToIntakePet(){
        testShelter.intake(anotherTestPet);
        int result = testShelter.shelterSize();
        assertEquals(1, result);
    }

    @Test
    public void shouldBeAbleToAdoptPet(){
        testShelter.intake(testPet);
        testShelter.intake(anotherTestPet);
        testShelter.adopt(testPet);
        int result = testShelter.shelterSize();
        assertEquals(1, result);
    }
    @Test
    public void shouldBeAbleToGetListOfAllPetsInMap(){
        testShelter.intake(testPet);
        testShelter.intake(anotherTestPet);
        Collection<String> result = testShelter.getAllPets();
        System.out.println(result);
    }

    @Test
    public void shouldBeAbleToGetSizeOfShelter(){
        testShelter.intake(testPet);
        testShelter.intake(anotherTestPet);
        testShelter.shelterSize();
        assertEquals(2, testShelter.shelterSize());
        System.out.println(testShelter.shelterSize());
    }
    @Test
    public void eatCounterShouldAddToHungerLevelOfAllPets(){
        testShelter.intake(testPet);
        testShelter.intake(anotherTestPet);
        testShelter.eatCounter();
        assertEquals(52, testPet.getHungerLevel());
        assertEquals(52, anotherTestPet.getHungerLevel());
    }

    @Test
    public void drinkCounterShouldAddToThirstLevelOfAllPets(){
        testShelter.intake(testPet);
        testShelter.intake(anotherTestPet);
        testShelter.drinkCounter();
        assertEquals(52, testPet.getThirstLevel());
        assertEquals(52, anotherTestPet.getThirstLevel());
    }

    @Test
    public void playCounterShouldAddToBoredomLevelOfPet(){
        testShelter.intake(testPet);
        testPet.play();
        assertEquals(52, testPet.getBoredomLevel());
    }
}
