
import java.util.*;
/**
 * Array_2d
 */
public class Array_2d {

    public static void main(String[] args) {

        int noRow;
        int noCollom;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the no. of row");
        noRow = s1.nextInt();
        System.out.println("Enter the no. of colloum");
        noCollom = s1.nextInt();

        int array[][] = new int[noRow][noCollom];

        // Storing no in array
        for(int i=0;i<noRow;i++)
        {
            for(int j =0; j<noCollom; j++){
                System.out.println("Enter  array" + "{" +  i +  "}" +"{" +  j + "}");
                array[i][j] =  s1.nextInt();
            }
        }

        //  displaying the array

        for(int z=0; z<noRow; z++ )
        {
            for(int x = 0; x<noCollom;x++)
            {
                System.out.println(array[z][x]);
            }
        }



    }
}