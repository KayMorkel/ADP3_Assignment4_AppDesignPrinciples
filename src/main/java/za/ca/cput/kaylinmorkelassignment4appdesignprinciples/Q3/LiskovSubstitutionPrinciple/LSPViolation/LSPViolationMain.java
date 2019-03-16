package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.LiskovSubstitutionPrinciple.LSPViolation;

public class LSPViolationMain
{
    public static void main(String[] args)
    {
        Employee emp = new Secretary("Kelly", "Otus", "3ADC");
        Employee emp1 = new JobShadower("Liam", "Earnest", "JS25");

        System.out.println(emp.empSalaryCalc(25, 12));
        System.out.println(emp1.empSalaryCalc(26, 12));
    }
}
