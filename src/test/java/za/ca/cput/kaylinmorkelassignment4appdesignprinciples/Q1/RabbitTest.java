package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RabbitTest
{
    Rabbit rab = new Rabbit("Peanut", "white");

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setNameRabbit() throws Exception
    {
        rab.setName("Maple");
        Assert.assertEquals("Maple", rab.getName());
    }
    @Test
    public void setColourRabbit() throws Exception
    {
        rab.setColour("Peach");
        Assert.assertEquals("Peach", rab.getColour());
    }
    @Test
    public void getNameRabbit() throws Exception
    {
        String name = rab.getName();
        Assert.assertEquals("Peanut", name);
    }
    @Test
    public void getColourRabbit() throws Exception
    {
        String col = rab.getColour();
        Assert.assertEquals("white", col);
    }
    @Test
    public void actionRabbit() throws Exception
    {
        String act = rab.action();
        Assert.assertEquals("A rabbit hops and squeaks", act);
    }

}
