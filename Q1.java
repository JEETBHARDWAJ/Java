class Constructure1 {
    private int x;
    private int y;
    Constructure1(){
        x =1;
        y = 2;
    }

    public void fun1(int a , int b)
    {
        x= a;
        y= b;
    }

    public void diplay(){
        System.out.println(x);
        System.out.println(y);
    }
    
}

class Q1{

    public static void main(String []args)
    {
        Constructure1 c1 = new Constructure1();
        c1.diplay();
        c1.fun1(2,3);
        c1.diplay();
    }
}