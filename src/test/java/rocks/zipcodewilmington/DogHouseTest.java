package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test

    public  void addTest(){
        // Given (some

        Dog dog1 = new Dog("Corgy", new Date() , 3);

        DogHouse.clear();

       //When

        DogHouse.add(dog1);

        int actual = DogHouse.getNumberOfDogs();

        int expected = 1;

        //Then

        Assert.assertEquals(expected, actual);
    }



    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public  void removeDogTestbyId(){

        //Given

    DogHouse.clear();
    Dog dog1 = new Dog("Smart", new Date() , 1);
    Dog dog2 = new Dog("Jojo", new Date() , 15);
    Dog dog3 = new Dog("Favorite", new Date() , 200);


        DogHouse.add(dog1);
        DogHouse.add(dog2);
        DogHouse.add(dog3);


    Dog actual = DogHouse.getDogById(1);
        Assert.assertEquals(actual.getName(),"Smart");

        DogHouse.remove(1);

    Dog actual2 = DogHouse.getDogById(1);



        Assert.assertNull(actual2);
}



    // TODO - Create tests for `void remove(Dog dog)`
 @Test
 public  void removeTest(){

     DogHouse.clear();
   Dog dog1 = new Dog("Smart", new Date() , 1);
    Dog dog2 = new Dog("Jojo", new Date() , 15);
    Dog dog3 = new Dog("Favorite", new Date() , 200);


        DogHouse.add(dog1);
        DogHouse.add(dog2);
        DogHouse.add(dog3);

        DogHouse.remove(dog1);
        DogHouse.remove(dog2);

    int actual = DogHouse.getNumberOfDogs();

    int expected = 1;

        Assert.assertEquals(expected, actual);
}


    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogbyIdTest(){
        DogHouse.clear();
       Dog dg1 = new Dog("Smart", new Date() , 1);
        Dog dg2 = new Dog("Sheru", new Date() , 14);
        DogHouse.add (dg1);
        DogHouse.add (dg2);


        Dog actual = DogHouse.getDogById(1);
        Dog actual2 = DogHouse.getDogById(14);

        Assert.assertEquals(dg1, actual);
        Assert.assertEquals(dg2, actual2);


    }



    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
