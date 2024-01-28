// abs class can not  access by object
abstract class Abs{

    int a,b ;
    void fun(int p ,int q){
        a = p;
        b = q;
    }

}
class Trac  extends Abs{


}

class Abstractt{

    public static void main(String args[])
    {
        Trac t1 = new Trac();
        System.out.println(t1.a);
        
    }
}