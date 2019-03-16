package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.LiskovSubstitutionPrinciple.LSPCorrection;

public class UnpaidEmployees extends Employee
{

    public UnpaidEmployees() {
    }

    public UnpaidEmployees(String name, String surname, String empId) {
        super(name, surname, empId);
    }

    public String empSal()
    {
        return "Employee does not get paid. He or she is here voluntarily or job-shadowing.";
    }
}
