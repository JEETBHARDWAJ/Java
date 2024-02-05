
class Frist1{
    int x;
    int y;
    Frist1(){ //constructure
        x=7;

    }

}

class Second extends Frist1{

    Second(){
    }
    System.out.println(x);

}

public class Interface_p1 {

    public static void main(String[] args) {
        Second s1 = new Second();

        
    }
}