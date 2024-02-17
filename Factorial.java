
public class Factorial {

    public static void main(String[] args) {
        int fact =1; 

        for(int i=0; i < args.length; i++)
        {
            fact = fact + fact* (Integer.parseInt(args[i]));
        }
        
    }
    System.out.println(fact);

}
