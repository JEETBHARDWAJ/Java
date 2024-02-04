class S{
void display(){
    System.out.println("calss s ");
}
}

class V extends S{
    @Override
    void display(){

        System.out.println("calss V ");

    }
}
public class Overriding {

    public static void main(String args[])
    {
    S s1 = new S();
    s1.display();

        
    } 
}
