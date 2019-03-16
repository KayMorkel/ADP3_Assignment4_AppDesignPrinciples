package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest
{
    //private House house;
    private Horse h1;

    @Before
    public void setUp() throws Exception
    {
        h1 = new Horse("Peter", "Black");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setName() throws Exception
    {
        h1.setName("Kelvin");
        Assert.assertEquals("Kelvin", h1.getName());
    }

    @Test
    public void setColour() throws Exception
    {
        h1.setColour("Pink");
        Assert.assertEquals("Pink", h1.getColour());
    }

    @Test
    public void getName() throws Exception
    {
        Assert.assertEquals("Peter", h1.getName());
    }

    @Test
    public void getColour() throws Exception
    {
        Assert.assertEquals("Black", h1.getColour());
    }

    @Test
    public void action() throws Exception
    {
        Assert.assertEquals("A horse trots and neighs", h1.action());
    }

    @Test
    public void getHouse() throws Exception
    {
        Assert.assertEquals("Stable", h1.getHouse());
    }
}