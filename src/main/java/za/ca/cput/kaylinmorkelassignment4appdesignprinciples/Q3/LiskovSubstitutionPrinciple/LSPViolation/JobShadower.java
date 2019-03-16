package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.LiskovSubstitutionPrinciple.LSPViolation;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class JobShadower extends Employee
{

    public JobShadower(String name, String surname, String empId)
    {
        super(name, surname, empId);
    }

    @Override
    public double empSalaryCalc(double rate, int paymentPeriod)
    {
        throw new NotImplementedException();
    }
}
