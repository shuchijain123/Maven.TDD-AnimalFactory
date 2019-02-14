package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`

    @Test
            public void DogInstanceTest() {

        Dog dg = new Dog("Corgy", new Date(), 12);

        Assert.assertTrue(dg instanceof Dog);
    }


    // TODO - Create tests for `speak`

    @Test
    public void speakDogTest(){
        Dog dg = new Dog("Corgy", new Date(), 12);
        String expected = "bark!";
        String actual = dg.speak();
        Assert.assertEquals(expected, actual);



    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void DogBirthDateTest(){
        Dog dg = new Dog("Corgy", new Date(), 12);
        Date actual = new Date();
        Date expected = dg.getBirthDate();
        Assert.assertEquals(expected, actual);




    }


    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void DogFoodTest(){
        Dog dg = new Dog("Corgy", new Date(), 12);
        Food food1 = new Food();
        Food food2 = new Food();

         dg.eat(food1);
         dg.eat(food2);
        int actual = dg.getNumberOfMealsEaten();
        int expected = 2;
        Assert.assertEquals(expected, actual);




    }
    @Test
    public void DogFoodTestNegative(){
        Dog dg = new Dog("Corgy", new Date(), 12);
        Food food1 = new Food();
        Food food2 = new Food();

        dg.eat(food1);
        dg.eat(food2);
        int actual = dg.getNumberOfMealsEaten();
        int expected = 1;
        Assert.assertNotEquals(expected, actual);




    }


    // TODO - Create tests for `Integer getId()`

    @Test
    public void DogIdTest(){
        Dog dg = new Dog("Corgy", new Date(), 12);
        int actual = 12;
        int expected = dg.getId();
        Assert.assertEquals(expected, actual);




    }


    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
            public void DGAnimalTest() {

        Dog dg = new Dog("Corgy", new Date(), 12);

        Assert.assertTrue(dg instanceof Animal);
    }



    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void DGMammalTest() {

        Dog dg = new Dog("Corgy", new Date(), 12);

        Assert.assertTrue(dg instanceof Mammal);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
