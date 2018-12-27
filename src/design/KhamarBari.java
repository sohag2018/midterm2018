package Design;

public abstract class KhamarBari {
    static String companyName ="Name: Khamar Bari Grocery";
    public String address = "Address: 37-16 73rd st, Flushing, NY 11377";
    public String owner = "Prop: Kamal LLC";
    public int regi = 3659182;
    public boolean inopeation=true;
    public final String mission ="Mission: Serving quality foods to the Bangladeshi Community people.";
    public final String values ="Values: 1.Hygenic, 2.Healty 3.Respectful 4.Promise ";





    public void CompProfile(){  //method implemented
        System.out.println("Group Profile: "+"\n"+mission+"\n"+values);
        System.out.println("Mother company: "+companyName+"\n"+address+"\n"+"Reg:"+regi+"\n"+owner+"\n"+"In-operation: "+inopeation);
        System.out.println("Established: May, 2005\n");

    }
    public abstract void Description();  //method declared
}
