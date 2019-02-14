package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import java.util.Date;
/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    @Test
    public void AnimalCreateDogtest(){


        String name = "Bruno";
        Date Birthdate = new Date();


        Dog mydog = AnimalFactory.createDog("Bruno",Birthdate);
        String expectedname = mydog.getName();
        Date expectedBirthdate = mydog.getBirthDate();



        Assert.assertEquals(expectedname, name);
        Assert.assertEquals(expectedBirthdate, Birthdate);





    }


    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void AnimalCreateCattest(){


        String name = "Mars";
        Date Birthdate = new Date();


        Cat mycat = AnimalFactory.createCat("Mars",Birthdate);
        String expectedname = mycat.getName();
        Date expectedBirthdate = mycat.getBirthDate();



        Assert.assertEquals(expectedname, name);
        Assert.assertEquals(expectedBirthdate, Birthdate);





    }
}
