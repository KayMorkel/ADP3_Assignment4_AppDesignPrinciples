package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HouseTest
{
    private House house1;
    @Before
    public void setUp() throws Exception
    {
        house1 = new House();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setHouseType()
    {
        house1.setHouseType("Tunnel");
        Assert.assertSame("Tunnel", house1.getHouseType()); //With this line of code we can see that the getHouseType method works.
    }
}