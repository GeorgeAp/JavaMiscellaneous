import org.junit.Assert;
import org.junit.Test;

public class TestEmployeeDetails {

    EmployeeBusinessLogic employeeBusinessLogic = new EmployeeBusinessLogic();
    EmployeeDetails employee = new EmployeeDetails();

    // test for appraisal
    @Test
    public void testCalculateAppraisal(){
        employee.setName("Jorge");
        employee.setAge(30);
        employee.setMonthlySalary(8000);

        double appraisal = employeeBusinessLogic.calculateAppraisal(employee);
        Assert.assertEquals(500, appraisal, 0.0);
    }

    // test for yearly salary
    @Test
    public void testCalculateYearlySalary(){
        employee.setName("Jorge");
        employee.setAge(30);
        employee.setMonthlySalary(8000);

        double salary = employeeBusinessLogic.calculateYearlySalary(employee);
        Assert.assertEquals(96000, salary, 0.0);
    }
}
