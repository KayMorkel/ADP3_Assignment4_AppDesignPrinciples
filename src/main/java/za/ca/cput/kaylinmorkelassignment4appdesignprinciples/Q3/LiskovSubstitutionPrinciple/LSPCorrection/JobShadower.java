package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.LiskovSubstitutionPrinciple.LSPCorrection;

public class JobShadower extends UnpaidEmployees
{
    public JobShadower() {
    }

    public JobShadower(String name, String surname, String empId) {
        super(name, surname, empId);
    }

    @Override
    public String empSal() {
        return super.empSal();
    }
}
