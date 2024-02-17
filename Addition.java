public class Addition {
public static void main(String []args) {
    int sum =0  ;
    

    for(int i=0; i<args.length; i++)
    {

        
        sum = sum + Integer.parseInt(args[i]);
        
        
    }
    System.out.println("SUM--->" + sum);
    System.out.println("Avrage--->" + sum/2 );

}    
}
