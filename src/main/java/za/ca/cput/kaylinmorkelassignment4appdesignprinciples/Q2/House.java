package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q2;

public class House
{
    private String houseType;

    public House()
    {
        houseType = "";
    }

    public House(String houseTpe) {
        this.houseType = houseTpe;
    }

    public void setHouseType(String houseType)
    {
        this.houseType = houseType;
    }

    public String getHouseType()
    {
        return houseType;
    }

    public String toString()
    {
        return "House type is: " + houseType;
    }
}
