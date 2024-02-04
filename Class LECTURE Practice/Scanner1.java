import java.util.*;
class Scanner1{
    public static void main(String args[])
    {
        Scanner newOb = new Scanner(System.in);    // newOb is oject


        System.out.println("Enter user name:");
        String useId =  newOb.nextLine();


        System.out.println("Enter Id:");
        String password =  newOb.nextLine();

        // System.out.println("your username in" +useId, "and password" + password);
        
        System.out.println("your username " +useId);




        // System.out.println(useId);
        // System.out.println(password);
    }
    
}