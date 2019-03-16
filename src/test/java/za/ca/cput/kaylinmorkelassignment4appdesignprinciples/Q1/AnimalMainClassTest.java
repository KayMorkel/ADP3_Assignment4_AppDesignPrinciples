package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalMainClassTest
{
    private Animal[] aniArray = new Animal[10];

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main()
    {
        Assert.assertTrue( true );
    }
    @Test
    public void animalArray()
    {
        int num = 0;
        aniArray[num++] = new Rabbit("Peanut", "white");
        aniArray[num++] = new Horse("Grey", "black");
        aniArray[num++] = new Horse("Matilda", "white");

        for(int i = 0; i < aniArray.length; i++)
        {
            if(aniArray[i] instanceof Horse)
            {
                Assert.assertEquals(Horse.class, aniArray[i].getClass());
                System.out.println(aniArray[i].toString()+"\n");

                if(aniArray[i].getName() == "Matilda")
                {
                    Assert.assertEquals(2, i);
                    System.out.println("The Rabbit named Matilda is at index: " + i+ " in the array.\n");
                }
            }
            else if(aniArray[i] instanceof Rabbit)
            {
                Assert.assertEquals(Rabbit.class, aniArray[i].getClass());
                System.out.println(aniArray[i].toString()+"\n");

                if(aniArray[i].getName() == "Peanut")
                {
                    Assert.assertEquals(0, i);
                    System.out.println("The Horse named Peanut is at index: " + i+ " in the array.\n");
                }
            }
        }
    }
}