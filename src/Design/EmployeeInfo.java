package Design;

import java.util.Scanner;

public class EmployeeInfo extends KhamarBari implements Employee {

    /* Exception Handling is not used */

    static String companyName;
    private int empID;
    private String empName;
    private int monthlySalary;
    private String department;
    private char sex;
    private boolean usaCitizen;
    private int performance;

    //default constructor
    public EmployeeInfo(){
    }
    //parameterized constructor created
    public EmployeeInfo(int empID, String empName, String department,char sex,boolean usaCitizen,int performance) {
        this.empID = empID;
        this.empName = empName;
        this.sex = sex;
        this.usaCitizen = usaCitizen;
        this.performance = performance;
        System.out.println("ID :"+empID+" "+"Name: "+empName+" "+"Department: "+department+" "+"Sex: "+sex+" "+"USACitizen: "+usaCitizen+" "+"Performance: "+performance);
    }
    public EmployeeInfo(int empID, String empName, String department, int monthlySalary, char sex, boolean usaCitizen, int performance) {
        this.empID = empID;
        this.empName = empName;
        this.department = department;
        this.monthlySalary = monthlySalary;
        this.sex = sex;
        this.usaCitizen = usaCitizen;
        this.performance = performance;
        System.out.println("Direcor's Profile: "+"\nID:"+empID+", Name: "+empName+" "+"Dept: "+department+"Yearly salary :$"+ monthlySalary*12+" " +"Sex: "+sex+" "+"USACitizen: "+usaCitizen+" "+"Performance: "+performance);
    }

    //Getter setter method for encapsulation
    public int getEmpID() { return empID; }
    public void setEmpID(int empID) { this.empID = empID; }
    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getMonthlySalary() { return monthlySalary; }
    public void setMonthlySalary(int monthlySalary) { this.monthlySalary = monthlySalary; }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public boolean isUsaCitizen() {
        return usaCitizen;
    }
    public void setUsaCitizen(boolean usaCitizen) {
        this.usaCitizen = usaCitizen;
    }
    public float getPerformance() {
        return performance;
    }
    public void setPerformance(int performance) {
        this.performance = performance;
    }


    //additional method implemented
    public void healthInsurance(){
        System.out.println("* All the employees get free health benefits without some exception\n");
    }
    //parameterized constructor (implemented)
    public EmployeeInfo(int employeeId){ this.empID = employeeId; }
    public EmployeeInfo(String name, int employeeId){ this.empName = name; this.empID = employeeId; }


    //Method overloading (Polymorphism)
    public int calculateEmployeeYearlyBonus(int numberOfYearsWithCompany){
        int total=0;
        return total;
    }
    public int  calculateEmployeeYearlyBonus(int salary, int performance) {
        this.monthlySalary = salary;
        this.performance = performance;
        int yearlyBonus = 0;
        if (performance == 5) {
            yearlyBonus = (int)(monthlySalary * 0.1 * 12);
        } else if (performance == 4) {
            yearlyBonus = (int)(monthlySalary * 0.08 * 12);
        } else if (performance == 3) {
            yearlyBonus = (int)(monthlySalary * 0.06 * 12);
        } else if (performance == 2) {
            yearlyBonus = 0;
            System.out.println("** Performance is not up to the mark. Need councelling/training.");
        } else if (performance == 1){
            yearlyBonus = 0;
            System.out.println("Need immidiate steps by the management.");
        }
        return yearlyBonus;
    }

    public int calculateEmployeeMonthlyPension(int salary){
        int total=0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate= sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);
        String startYear = convertedJoiningDate.substring(convertedJoiningDate.length() - 4, convertedJoiningDate.length());
        String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length() - 4, convertedTodaysDate.length());

        int start = Integer.parseInt(startYear);
        int current = Integer.parseInt(currentYear);

        //Calculate pension
        int numberOfYears = current - start;

        if (numberOfYears >= 5) {
            total = (int) (salary* .25);
        } else if (numberOfYears == 4) {
            total = (int) (salary * .20);
        } else if (numberOfYears == 3) {
            total = (int) (salary * .15);
        } else if (numberOfYears == 2) {
            total = (int) (salary * .10);
        } else if (numberOfYears == 1) {
            total = (int) (salary * .05);
        } else if (numberOfYears == 0) {
            total = 0;
        }
        System.out.println("Your Monthly pension according to staying with us: $" + total +"\n");

        return total;
    }

  //  @Override
    public void Description() {

    }

   // @Override
    public int employeeId() {
        return 0;
    }

   // @Override
    public String employeeName() {
        return null;
    }

   // @Override
    public void assignDepartment() {

    }
   // @Override
    public int calculateYearlySalary() {
        int monthlySalary = this.monthlySalary;
        int yearlySalary = (int)(12*monthlySalary);
        return yearlySalary;
    }

   // @Override
    public void benefitLayout() {

    }

    private static class DateConversion { //nested class!

        public DateConversion(Months months){}

        public static String convertDate(String date) {
            String [] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 7;
                    break;
                case August:
                    date = 8;
                    break;
                case September:
                    date = 9;
                    break;
                case October:
                    date = 10;
                    break;
                case November:
                    date = 11;
                    break;
                case December:
                    date = 12;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;
        }
    }
}