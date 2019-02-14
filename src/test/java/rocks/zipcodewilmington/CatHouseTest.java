package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`


    @Test

    public  void addTest(){

       Cat cat1 = new Cat("Blue", new Date() , 3);

     CatHouse.clear();

        CatHouse.add(cat1);

       int actual = CatHouse.getNumberOfCats();

        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Cat cat)`



    @Test

    public  void removeTest(){
        CatHouse.clear();
       Cat cats1 = new Cat("Blue", new Date() , 1);
        Cat cats2 = new Cat("Purpule", new Date() , 3);
        Cat cats3 = new Cat("green", new Date() , 2);


        CatHouse.add(cats1);
        CatHouse.add(cats2);
        CatHouse.add(cats3);

        CatHouse.remove(cats1);

        int actual = CatHouse.getNumberOfCats();

        int expected = 2;

        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `void remove(Integer id)`


    @Test

    public  void removeTestbyId(){
        CatHouse.clear();
        Cat cts1 = new Cat("Blue", new Date() , 1);
        Cat cts2 = new Cat("Purpule", new Date() , 99);
        Cat cts3 = new Cat("green", new Date() , 2);

        CatHouse.add (cts1);
       CatHouse.add(cts2);
       CatHouse.add(cts3);

        Cat actual = CatHouse.getCatById(1);
        Assert.assertEquals(actual.getName(),"Blue");

        CatHouse.removeCatById(1);

        Cat actual2 = CatHouse.getCatById(1);



        Assert.assertNull(actual2);
    }


    @Test

   public  void removeTestbyIdNegative(){
        CatHouse.clear();
       Cat ctz1 = new Cat("Blue", new Date() , 1);
       Cat ctz2 = new Cat("Purpule", new Date() , 5);
      Cat ctz3 = new Cat("green", new Date() , 2);

      CatHouse.add (ctz1);
       CatHouse.add(ctz2);
        CatHouse.add(ctz3);

       CatHouse.removeCatById(1);

       Cat actual = CatHouse.getCatById(5);



      Assert.assertEquals(ctz2, actual);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`


@Test
    public void getCatbyIdTest(){
    CatHouse.clear();
    Cat ctz1 = new Cat("Blue", new Date() , 1);
    CatHouse.add (ctz1);


    Cat actual = CatHouse.getCatById(1);

    Assert.assertEquals(ctz1, actual);


    }






    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void getNumberofcattest(){

        Cat ctz2 = new Cat("Blue", new Date() , 1);
        CatHouse.add (ctz2);


        int actual = CatHouse.getNumberOfCats();
        int expected = 1;

        Assert.assertEquals(1, actual);


    }




}
