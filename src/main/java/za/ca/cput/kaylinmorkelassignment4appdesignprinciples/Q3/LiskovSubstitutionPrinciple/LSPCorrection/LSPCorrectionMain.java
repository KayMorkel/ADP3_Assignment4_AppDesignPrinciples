package za.ca.cput.kaylinmorkelassignment4appdesignprinciples.Q3.LiskovSubstitutionPrinciple.LSPCorrection;

public class LSPCorrectionMain
{
    public static void main(String[] args)
    {
        Employee emp = new Secretary("Lily", "Merle", "216YE");
        Employee emp1 = new JobShadower("Jake", "Larsen", "HJ531");

        System.out.println("Name: " + emp.getName() + "\nSurname: " + emp.getSurname() + "\nId: " + emp.getEmpId() + "\nSalary: " + ((Secretary) emp).empSalaryCalc(20, 7));
        System.out.println();
        System.out.println("Name: " + emp1.getName() + "\nSurname: " + emp1.getSurname() + "\nId: " + emp1.getEmpId() + "\nSalary: " + ((JobShadower) emp1).empSal());
    }
}
