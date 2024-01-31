
public class Multip_matrix {

    public static void main(String []args)
    {
        int matrixm1[][] = {{1,3,1},{2,1,1}}; 
        int matrixm2[][] = {{2,1,1},{3,2,1}}; 
        int sum_matrix[][] = new int[2][2]; 
        int sum = 0;


        for(int x = 0; x<3;x++)
        {
            for(int y = 0; y<3;y++){
                for(int z = 0 ; z<2;z++){
                    sum = sum + matrixm1[x][z]*matrixm2[z][y];
                    sum_matrix[x][y] = sum;
                }
            }
        }

        


        //display sum of the matrix
        for(int i = 0; i<2;i++)
        {
            for(int j = 0 ; j<2; j++)
            {
                System.out.println(sum_matrix[i][j]);
            }
        }
    }
    

    
}
