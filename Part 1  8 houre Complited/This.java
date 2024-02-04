import java.util.Scanner;

class ThisTest{
    private int x;
    private int y;
    int z;
   void fun(int x , int y, int z)
   {
    this.x = x;
    this.y = y;
    this.z = z;
   }
   void fun2(){
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
   }

}

public class This {
    public static void main(String []args)

    {
        int a,b,c;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a:");
        System.out.println("Enter b:");
        System.out.println("Enter c:");
        a = s1.nextInt();

        ThisTest t1 = new ThisTest();
        t1.fun(1, 02, 03);
        t1.fun2();

    }
}
