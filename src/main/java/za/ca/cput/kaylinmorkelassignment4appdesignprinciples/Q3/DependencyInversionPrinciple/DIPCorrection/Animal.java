package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.DependencyInversionPrinciple.DIPCorrection;

public class Animal
{
    private ActionOfAnimal actionAni;

    public Animal(ActionOfAnimal acAni)
    {
        actionAni = acAni;
    }

    public String action()
    {
        return actionAni.action();
    }


}
