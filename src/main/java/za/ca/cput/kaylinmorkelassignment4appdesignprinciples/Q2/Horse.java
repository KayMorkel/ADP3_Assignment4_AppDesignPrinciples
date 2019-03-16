package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q2;

public class Horse implements AnimalsDetails
{
    private String action;
    private House house;
    private String name;
    private String colour;

    public Horse(String name, String colour)
    {
        this.name = name;
        this.colour = colour;
        this.house = new House();
        house.setHouseType("Stable");
    }
    @Override
    public void setName(String name)
    {
        this.name = name;
    }
    @Override
    public void setColour(String colour) {
       this.colour = colour;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getColour() {
        return colour;
    }
    @Override
    public String action()
    {
        action = "A horse trots and neighs";
        return action;
    }
    public String getHouse()
    {
        return house.getHouseType();
    }
    public String toString()
    {
        return "Name: " + name + "\nColour: " + colour +"\nHouse type for a Horse: " + this.getHouse() + "\nActions: " + action();
    }

}