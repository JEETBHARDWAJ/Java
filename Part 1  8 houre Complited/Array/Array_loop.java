
import java.util.Scanner;

public class Array_loop {
    public static void main(String[] args) {

        int x[] = new int[3];

        Scanner s1 = new Scanner(System.in);
        
        for(int p =0 ; p<3; p++){

            System.out.println("Enter the array :"+ p +":");
            x[p] = s1.nextInt();

        }


        for(int a=0; a<3; a++){
            System.out.println(x[a]);
        }

    }

}
