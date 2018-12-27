package Design1;

public interface Employee {

    //Method declared in interface (supplied)
    public int employeeId();
    public String employeeName();
    public void assignDepartment();
    public int calculateYearlySalary();
    public void benefitLayout();

    //default and static method can be implemented in Interface(created)
    public default void startUpBonus(){
        System.out.println("\n Common Benefits: ");
        System.out.println("* Every employee will be eligible to have $1000 as a joining bonus");
    }
    public static void housing(){
        System.out.println("* Only permanent emplloyees will be eligible to have the 50% discounted rate company owned apartment");
    }
    public static void transport(){
        System.out.println("* All employees will be allowed to use office transportion facilities for office pick up and drop off service and as per office need");
    }
    public static void education(){
        System.out.println("* Only permanent employees will be paid $500/child");
    }

}