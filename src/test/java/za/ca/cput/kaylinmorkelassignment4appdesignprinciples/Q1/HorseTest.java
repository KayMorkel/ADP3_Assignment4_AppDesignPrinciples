package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HorseTest
{
    Horse hor = new Horse("Rudolf", "black");

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void setNameHorse() throws Exception
    {
        hor.setName("Kel");
        Assert.assertEquals("Kel", hor.getName());
    }
    @Test
    public void setColourHorse() throws Exception
    {
        hor.setColour("Plum");
        Assert.assertEquals("Plum", hor.getColour());
    }
    @Test
    public void getNameHorse() throws Exception
    {
        String name1 = hor.getName();
        Assert.assertEquals("Rudolf", name1);
    }
    @Test
    public void getColourHorse() throws Exception
    {
        String col1 = hor.getColour();
        Assert.assertEquals("black", col1);
    }
    @Test
    public void actionHorse() throws Exception
    {
        String act1 = hor.action();
        Assert.assertEquals("A horse trots and neighs", act1);
    }
}
