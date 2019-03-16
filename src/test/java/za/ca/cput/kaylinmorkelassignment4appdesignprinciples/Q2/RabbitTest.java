package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RabbitTest
{
    private Rabbit r1;

    @Before
    public void setUp() throws Exception
    {
        r1 = new Rabbit("Henry", "White");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setName()
    {
        r1.setName("Lemon");
        Assert.assertEquals("Lemon", r1.getName());
    }

    @Test
    public void setColour()
    {
        r1.setColour("Yellow");
        Assert.assertEquals("Yellow", r1.getColour());
    }

    @Test
    public void getName()
    {
        Assert.assertEquals("Henry", r1.getName());
    }

    @Test
    public void getColour()
    {
        Assert.assertEquals("White", r1.getColour());
    }

    @Test
    public void action()
    {
        Assert.assertEquals("A rabbit hops and squeaks", r1.action());
    }

    @Test
    public void getHouse()
    {
        Assert.assertEquals("Burrow", r1.getHouse());
    }
}