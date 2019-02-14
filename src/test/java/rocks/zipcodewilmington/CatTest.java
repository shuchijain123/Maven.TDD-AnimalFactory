package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
//import sun.util.calendar.BaseCalendar;

import java.util.ArrayList;
import java.util.Date;
import java.lang.*;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    Cat ct = new Cat("Billy", new Date(), 9);

    @Test
    public void setNameTest() {

        ct.setName("Billy");


    }


    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        Cat ct = new Cat("Billy", new Date(), 9);
        String actual = "meow!";
        String expected = ct.speak();
        Assert.assertEquals(expected, actual);


    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {


        ct.setBirthDate(new Date());

    }


    // TODO - Create tests for `void eat(Food food)`


    @Test
    public void eatTest() {

        int actual = 1;
        Food food = new Food();

        Cat ct = new Cat("Billy", new Date(), 9);
        ct.eat(food);
        int expected = ct.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);


    }


    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdtest() {

        int expected = 9;

        int actual = ct.getId();
        Assert.assertEquals(expected, actual);

    }


    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void AnimalInterfacetest() {

        Cat ct = new Cat("Billy", new Date(), 9);
        Assert.assertTrue(ct instanceof Animal);


        // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    }

    @Test
    public void MammalInheritancetest() {

        Cat ct = new Cat("Billy", new Date(), 9);
        Assert.assertTrue(ct instanceof Mammal);



    }
    @Test

    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
