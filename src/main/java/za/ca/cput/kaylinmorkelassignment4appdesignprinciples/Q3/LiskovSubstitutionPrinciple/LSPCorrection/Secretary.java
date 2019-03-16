package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.LiskovSubstitutionPrinciple.LSPCorrection;

public class Secretary extends PaidEmployees
{
    public Secretary()
    {

    }
    public Secretary(String name, String surname, String empId) {
        super(name, surname, empId);
    }
    @Override
    public double empSalaryCalc(double rate, int paymentPeriod) {
        return super.empSalaryCalc(rate, paymentPeriod);
    }
}
