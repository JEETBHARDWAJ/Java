//function overloding

class NewFun{
    void fun1(int a, int b)
    {
        int sum = a+b;
        System.out.println(sum);
    }
    void fun1(int a , int b, int c)
    {
        int sum = a+b+c;
        System.out.println(sum);
    }
}
public class Function_Overloding {
    public static void main(String args[])
    {
        NewFun r1 = new NewFun();
        r1.fun1(1,2,3);

    }
    
}
