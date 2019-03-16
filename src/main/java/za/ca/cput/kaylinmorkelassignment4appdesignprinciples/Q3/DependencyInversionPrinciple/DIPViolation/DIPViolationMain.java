package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.DependencyInversionPrinciple.DIPViolation;

public class DIPViolationMain
{
    public static void main(String[] args)
    {
        Animal ani = new Animal();

        System.out.println(ani.animalAction());

    }
}
