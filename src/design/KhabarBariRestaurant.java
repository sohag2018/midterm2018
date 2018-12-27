package design;

public class KhabarBariRestaurant {
    public KhabarBariRestaurant(){
       // super(1345,"Kamal Hossin,","MGT Dept. Khabar Bari Restaurant & Khamar Bari Grocery,",'M',true,4);//only one constructor either default or parameterized, can be called by super from Parents class
       // super.benefitLayout(); //super can call it's parent's original method as well as it's inherited method from Interface and Abstract class.
        //super.healthInsurance(); we can call healthInsurance by using super word from super class also
    }

    public static void khabarBariRestaurantinfo(){
        System.out.println("\nOther Org. owned by Kamal LLC:");
        System.out.println("Khabar Bari Restaurant, Flushing, NY ");
    }
    //overriding (polymorphism)
    public double calculateEmployeeYearlyBonus(double salary, int performance) {

        double yearlyBonus = 0;
        if (performance == 5) {
            yearlyBonus = salary * 0.15 * 12;
        } else if (performance == 4) {
            yearlyBonus = salary * 0.10 * 12;
        } else if (performance == 3) {
            yearlyBonus = salary * 0.08 * 12;
        } else if (performance == 2) {
            yearlyBonus = salary * 0.04 * 12;
            System.out.println("** Performance is not up to the mark. Need councelling/training");
        } else if (performance == 1){
            yearlyBonus = 0;
            System.out.println("Need immidiate steps by the management");
        }
        return yearlyBonus;
    }
}

//EmployeeInfo - superClass
//KhabarBariRestaurant, KhamarBariJamaica - - subClass
//EmployeeInfo - - superClass,
//EmployeeInfo - KhabarBariRestaurant - - Single inheritance
//EmployeeInfo - KhabarBariRestaurant - KhamarBariBronx - - Multilevel inheritance
//EmployeeInfo - KhabarBariRestaurant, EmployeeInfo - KhamarBariJamaica - - hierearchical inheritance
