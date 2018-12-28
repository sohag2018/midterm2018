package Design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        EmployeeInfo emp1 = new EmployeeInfo("Kamrul", 2154565);
        try {
            Assert.assertEquals("Kamrul",emp1.getEmpName());
        }catch(Exception ex){
            ex.printStackTrace();
            Assert.assertEquals(2154565,emp1.getEmpID());
            emp1.setDepartment("Sales");
            Assert.assertEquals("Sales",emp1.getDepartment());
            emp1.setMonthlySalary(6000);
            Assert.assertEquals(6000,emp1.getMonthlySalary());
            emp1.setPerformance(5);
            Assert.assertEquals(5,emp1.getPerformance()); //not working
            double bonus101 = emp1.calculateEmployeeYearlyBonus(emp1.getMonthlySalary(), (int) emp1.getPerformance());
            Assert.assertEquals(26400.0,emp1.calculateEmployeeYearlyBonus(emp1.getMonthlySalary(), (int) emp1.getPerformance()));
            emp1.calculateEmployeeMonthlyPension((int)emp1.getMonthlySalary());
            Assert.assertEquals(2200,emp1.calculateEmployeeMonthlyPension((int)emp1.getMonthlySalary()));

        }
    }
}