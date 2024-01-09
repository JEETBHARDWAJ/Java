public class Sum {
    public static void main(String []args) {
        int Sum= 0;

        for(int i=0; i < args.length ;i++){

            Sum = Sum + Integer.parseInt(args[i]);

        }
        System.out.println(Sum);
    }
    
}
