package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.LiskovSubstitutionPrinciple.LSPViolation;

public class Secretary extends Employee
{

    public Secretary(String name, String surname, String empId) {
        super(name, surname, empId);
    }

    @Override
    public double empSalaryCalc(double rate, int paymentPeriod)
    {
        return rate * paymentPeriod;
    }
}
