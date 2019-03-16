package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.LiskovSubstitutionPrinciple.LSPCorrection;

public class PaidEmployees extends Employee
{
    public PaidEmployees() {
    }

    public PaidEmployees(String name, String surname, String empId) {
        super(name, surname, empId);
    }

    public double empSalaryCalc(double rate, int paymentPeriod)
    {
        return rate * paymentPeriod;
    }
}
