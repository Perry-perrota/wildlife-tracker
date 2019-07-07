package modules;
import org.junit.*;

import static org.junit.Assert.*;

public class AnimalTest {
    @Test
    public void animal_instantiatesCorrectly_true(){
        Animal testAnimal=new Animal("lion");
        assertEquals(true,testAnimal instanceof Animal);
    }
    @Test
    public void getName_animalInstantiatesWithName_lion(){
        Animal testAnimal=new Animal("lion");
        assertEquals("lion",testAnimal.getName());
    }
    @Test
    public void equals_returnsTrueIfNameMatchesAnother_true(){
        Animal firstAnimal=new Animal("lion");
        Animal secondAnimal=new Animal("lion");
        assertTrue(firstAnimal.equals(secondAnimal));
    }
    @Test
    public void save_insertsAnimalObjectsToDatabase(){
        Animal testAnimal=new Animal("lion");
        testAnimal.saveAnimal();
        assertTrue(Animal.allAnimals().get(0).equals(testAnimal));
    }

}