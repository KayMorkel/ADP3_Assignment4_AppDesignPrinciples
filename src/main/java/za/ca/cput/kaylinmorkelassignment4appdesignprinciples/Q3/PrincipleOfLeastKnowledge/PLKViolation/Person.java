package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.PrincipleOfLeastKnowledge.PLKViolation;

public class Person
{
    private String name;
    private String surname;
    private Animal animal;
    private Toy toy;

    public Person(String name, String surname, Animal animal)
    {
        this.name = name;
        this.surname = surname;
        this.animal = animal;
    }

    public Person() {
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
}
