package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.DependencyInversionPrinciple.DIPViolation;

public class Animal
{
    private Kangaroo kang;
    //private String action;

    public Animal()
    {
        kang = new Kangaroo();
    }
    public String animalAction()
    {
        return kang.action();
    }

}
