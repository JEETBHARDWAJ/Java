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
        Scanner s1 = 
        ThisTest t1 = new ThisTest();
        t1.fun(1, 02, 03);
        t1.fun2();

    }
}
