package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.PrincipleOfLeastKnowledge.PLKCorrection;

public class Person
{
    private String name;
    private String surname;
    private Animal animal;
    private Toy toy;

    public Person(String name, String surname, Animal animal, Toy toy)
    {
        this.name = name;
        this.surname = surname;
        this.animal = animal;
        this.toy = toy;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getToy() {
        return toy.getType();
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }
}
