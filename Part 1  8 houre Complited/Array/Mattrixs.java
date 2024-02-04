

public class Mattrixs {

    public static void main(String []args)
    {
        int matrixm1[][] = {{1,3,1},{2,1,1}}; 
        int matrixm2[][] = {{2,1,1},{3,2,1},{1,23,3}}; 
        int sum_matrix[][] = new int[3][3]; 
        int sum = 0;


        for(int x = 0; x<2;x++)
        {
            for(int y = 0; y<3;y++){
                for(int z = 0 ; z<3;z++){
                    sum = sum + matrixm1[x][z]*matrixm2[z][y];
                }
                sum_matrix[x][y] = sum;
            }
        }

        


        //display sum of the matrix
        for(int i = 0; i<3;i++)
        {
            for(int j = 0 ; j<3; j++)
            {
                System.out.println(sum_matrix[i][j]);
            }
        }
    }
    

    
}
